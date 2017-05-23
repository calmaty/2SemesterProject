
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
                String lastName = rs.getString("lastname");
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
    public List<EverythingByAuthor> PlotCitiesAndBooksFromAuthor(String AuthorFirstName, String AuthorLastName) {
        List<EverythingByAuthor> citiesAndBooksFromAuthor = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "SELECT cities.name,cities.latitude,cities.longitude,books.title\n"
                + "FROM (((cities\n"
                + "INNER JOIN books ON cities.id= books.id\n"
                + "INNER JOIN bookauthors ON books.id = bookauthors.book_id)\n"
                + "INNER JOIN citiesinbooks ON cities.id= citiesinbooks.city_id))"
                + " where bookauthors.firstname = ? and bookauthors.lastname= ? ";
        EverythingByAuthor eba = new EverythingByAuthor();
        City c = new City();
        
        GeoLocation gl = new GeoLocation();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, AuthorFirstName);
            preparedStatement.setString(2, AuthorLastName);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String cityName = rs.getString("name");
                float latitude = rs.getFloat("latitude");
                float longitude = rs.getFloat("longitude");
                String title = rs.getString("title");
                eba.setCityLatitude(latitude);
                eba.setCityLongitude(longitude);
                eba.setCityName(cityName);
                eba.setBookTitle(title);
                citiesAndBooksFromAuthor.add(eba);
            }

            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {
            System.out.println("Plot Cities From Author failed");
        }

        return citiesAndBooksFromAuthor;

    }

    @Override
    public List<Book> GetBooksByLocation(GeoLocation Location) {
        List<Book> citiesByLocation = new ArrayList<>();
        Connection con = SqlConnection.getConnection();

        String sql = "SELECT books.title , bookauthors.firstname,bookauthors.lastname\n "
                + "FROM (((cities\n "
                + "INNER JOIN citiesinbooks ON cities.id= citiesinbooks.city_id\n "
                + "INNER JOIN books ON cities.id= books.id)\n "
                + "INNER JOIN bookauthors ON books.id = bookauthors.book_id)) "
                + "where latitude = ? and longitude = ? ";

        Book b = new Book();
        float lat = Location.getLatitude();
        float lon = Location.getLongitude();

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setFloat(1, lat);
            preparedStatement.setFloat(2, lon);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.toString());
                String bookTitle = rs.getString("title");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                b.setTitle(bookTitle);
                b.setAuthorFirstName(firstName);
                b.setAuthorLastName(lastName);

                citiesByLocation.add(b);
            }

            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return citiesByLocation;

    }


}
