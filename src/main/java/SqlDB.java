
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christoffer
 */
public class SqlDB implements IDBObject {

    @Override
    public List<Book> GetBookAndAuthor(String CityName) {
        List<Book> booksAndAuthors = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql
                = "SELECT bookauthors.firstname, bookauthors.lastname,books.title\n"
                + "FROM (((bookauthors\n"
                + "INNER JOIN books ON bookauthors.book_id = books.id)\n"
                + "INNER JOIN cities ON cities.id = bookauthors.book_id)\n"
                + "INNER JOIN citiesinbooks ON cities.id= citiesinbooks.city_id)"
                + " where cities.name = ?";
        Book b = new Book();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, CityName);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String firstName = rs.getString("firstname");
                String bookTitle = rs.getString("title");
                String lastName = rs.getString("lasttname");
                b.setTitle(bookTitle);
                b.setAuthorFirstName(firstName);
                b.setAuthorLastName(lastName);
               
                booksAndAuthors.add(b);
            }

            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {
            System.out.println("Get Book and Author failed");
        }

        return booksAndAuthors;

    }

    @Override
    public List<City> PlotCitiesFromBook(String BookName) {
        List<City> citiesFromBook = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "SELECT cities.name,cities.latitude,cities.longitude\n"
                + "FROM ((cities\n"
                + "INNER JOIN citiesinbooks ON cities.id= citiesinbooks.city_id\n"
                + "INNER JOIN books ON cities.id= books.id))  where books.title = ?;";
        City c = new City();
        GeoLocation gl = new GeoLocation();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, BookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String cityName = rs.getString("name");
                float latitude = rs.getFloat("latitude");
                float longitude = rs.getFloat("longitude");
                gl.setLatitude(latitude);
                gl.setLongitude(longitude);
                c.setName(cityName);
                c.setLocation(gl);
                citiesFromBook.add(c);
            }
            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {
            System.out.println("PlotCities From Books failed");
        }

        return citiesFromBook;

    }

    @Override
    public List<City> PlotCitiesFromAuthor(String AuthorName) {
        List<City> citiesFromAuthor = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "SELECT cities.name,cities.latitude,cities.longitude\n"
                + "FROM (((cities\n"
                + "INNER JOIN books ON cities.id= books.id\n"
                + "INNER JOIN bookauthors ON books.id = bookauthors.book_id)\n"
                + "INNER JOIN citiesinbooks ON cities.id= citiesinbooks.city_id))\n"
                + "where bookauthors.firstname = ? and bookauthors.lastname= ?";

        int indexOfLastCapitolLetter = Utility.lastIndexOfUCL(AuthorName);
        String firstAuthorName = AuthorName.substring(0, indexOfLastCapitolLetter - 1);
        String lastAuthorName = AuthorName.substring(indexOfLastCapitolLetter, AuthorName.length());
        City c = new City();
        GeoLocation gl = new GeoLocation();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, firstAuthorName);
            preparedStatement.setString(2, lastAuthorName);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String cityName = rs.getString("name");
                float latitude = rs.getFloat("latitude");
                float longitude = rs.getFloat("longitude");
                gl.setLatitude(latitude);
                gl.setLongitude(longitude);
                c.setName(cityName);
                c.setLocation(gl);
                citiesFromAuthor.add(c);
            }

            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {
            System.out.println("Plot Cities From Author failed");
        }

        return citiesFromAuthor;

    }

    @Override
    public List<Book> GetBooksByLocation(GeoLocation Location) {
        List<Book> citiesByLocation = new ArrayList<>();
        Connection con = SqlConnection.getConnection();

        String sql = "SELECT books.title , bookauthors.firstname,bookauthors.lastname\n" +
        "FROM (((cities\n" +
        "INNER JOIN citiesinbooks ON cities.id= citiesinbooks.city_id\n" +
        "INNER JOIN books ON cities.id= books.id)\n" +
        "INNER JOIN bookauthors ON books.id = bookauthors.book_id)\n" +
        ") where latitude = ? and longitude = ?";
        
        Book b = new Book();
        GeoLocation gl = new GeoLocation();
        gl.setLatitude(Location.getLatitude());
        gl.setLongitude(Location.getLongitude());
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setFloat(1, gl.getLatitude());
            preparedStatement.setFloat(2, gl.getLongitude());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                b.setTitle(title);
               
                b.setAuthorFirstName(firstName);
                b.setAuthorLastName(lastName);
                citiesByLocation.add(b);
                
            }
            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {
            System.out.println("Get Books by Location failed");
        } 

        return citiesByLocation;

    }

}
