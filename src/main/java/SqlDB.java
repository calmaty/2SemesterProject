
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
                = "SELECT DISTINCT bookauthors.author, books.title\n"
                + "FROM (((bookauthors\n"
                + "INNER JOIN books  ON books.id = bookauthors.book_id) \n"
                + "INNER JOIN citiesinbooks ON citiesinbooks.book_id = books.id)\n"
                + "INNER JOIN cities ON  cities.id = citiesinbooks.city_id)\n"
                + "where cities.name = ? ";
        Book b = new Book();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, CityName);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String authorName = rs.getString("author");
                String bookTitle = rs.getString("title");
                b.setTitle(bookTitle);
                b.setAuthor(authorName);

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
        String sql = "SELECT DISTINCT cities.name,cities.latitude,cities.longitude\n"
                + "FROM ((books\n"
                + "INNER JOIN citiesinbooks ON citiesinbooks.book_id = books.id)\n"
                + "INNER JOIN cities ON cities.id = citiesinbooks.city_id)  \n"
                + "where books.title = ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, BookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                City c = new City();
                GeoLocation gl = new GeoLocation();
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
    public List<EverythingByAuthor> PlotCitiesAndBooksFromAuthor(String AuthorFirstName) {
        List<EverythingByAuthor> citiesAndBooksFromAuthor = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "SELECT DISTINCT cities.name,cities.latitude,cities.longitude,books.title\n"
                + "FROM (((bookauthors\n"
                + "INNER JOIN books ON  books.id = bookauthors.book_id)\n"
                + "INNER JOIN citiesinbooks ON citiesinbooks.book_id = books.id)\n"
                + "INNER JOIN cities ON cities.id = citiesinbooks.city_id)\n"
                + "where bookauthors.author = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, AuthorFirstName);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                EverythingByAuthor eba = new EverythingByAuthor();

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

        String sql = "SELECT DISTINCT books.title\n"
                + "FROM ((cities\n"
                + "INNER JOIN citiesinbooks ON  citiesinbooks.city_id = cities.id) \n"
                + "INNER JOIN books ON books.id = citiesinbooks.book_id) \n"
                + "where latitude < ?  and longitude > ? and latitude > ? and longitude < ? ";

        float latmax = Location.getLatitude() + 1f;
        float latmin = Location.getLatitude() - 1f;
        float lonmax = Location.getLongitude() + 1f;
        float lonmin = Location.getLongitude() - 1f;

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setFloat(1, latmax);
            preparedStatement.setFloat(2, lonmin);
            preparedStatement.setFloat(3, latmin);
            preparedStatement.setFloat(4, lonmax);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Book b = new Book();
                String bookTitle = rs.getString("title");
                b.setTitle(bookTitle);
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
