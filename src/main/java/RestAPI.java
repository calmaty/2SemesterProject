
import com.google.gson.Gson;
import java.util.List;
import static spark.Spark.*;

public class RestAPI {

    static Gson gson = new Gson();

    static DBController DBC;

    public static void main(String[] args) {
        Neo4jDB NDB = new Neo4jDB();
        DBC = new DBController(new Neo4jDB(), new SqlDB());
        DBC.SwichDB();
        port(8080);

        get("/bookAndAuthor/:city", (request, response) -> {
            String city = request.params("city");
             
            List<Book> booksAndAuthors = DBC.ActiveDB.GetBookAndAuthor(city);
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

            List<Book> booksFromLocation = DBC.ActiveDB.GetBooksByLocation(gloc);
            response.status(200);
            return booksFromLocation;
        });

        get("/citiesFromBooks/:book", (request, response) -> {
            String book = request.params("book");
            List<City> citiesFromBook = DBC.ActiveDB.PlotCitiesFromBook(book);
            String s = new Gson().toJson(citiesFromBook);
            return s;
        });

        get("/citiesFromAuthor/:authorName", (request, response) -> {
            String authorName = request.params("authorName");
            List<EverythingByAuthor> citiesFromAuthor = DBC.ActiveDB.PlotCitiesAndBooksFromAuthor(authorName);
            String s = new Gson().toJson(citiesFromAuthor);
            return s;

        });

    }

}
