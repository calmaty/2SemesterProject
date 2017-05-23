
import com.google.gson.Gson;
import java.util.List;
import static spark.Spark.*;

public class RestAPI {

   static Gson gson = new Gson();

    public static void main(String[] args) {
        
        port(8080);

        get("/bookAndAuthor/:city", (request, response) -> {
            String city = request.params("city");
            SqlDB sqlDB = new SqlDB();
            List<Book> booksAndAuthors = sqlDB.GetBookAndAuthor(city);
            response.status(200);
            return booksAndAuthors;
        });

        get("/geolocation/:latitude/:longitude", (request, response) -> {
            String latitude = request.params("latitude");
            String longitude = request.params("longitude");
            GeoLocation gloc = new GeoLocation();
            float lat = Float.valueOf(latitude);
            float lon = Float.valueOf(longitude);
            gloc.setLatitude(lat);
            gloc.setLongitude(lon);
            SqlDB sqlDB = new SqlDB();

            List<Book> booksFromLocation = sqlDB.GetBooksByLocation(gloc);
            response.status(200);
            return booksFromLocation;
        });

        get("/citiesFromBooks/:book", (request, response) -> {
            String book = request.params("book");
            SqlDB sqlDB = new SqlDB();
            List<City> citiesFromBook = sqlDB.PlotCitiesFromBook(book);
            String s = new Gson().toJson(citiesFromBook);
            return s;
        });

        get("/citiesFromAuthor/:authorFirstName/:authorLastName", (request, response) -> {
            String authorFirstName = request.params("authorFirstName");
            String authorLastName = request.params("authorLastName");
            SqlDB sqlDB = new SqlDB();
            List<City> citiesFromAuthor = sqlDB.PlotCitiesAndBooksFromAuthor(authorFirstName,authorLastName);
            String s = new Gson().toJson(citiesFromAuthor);
            return s;

        });

    }

}
