
import java.util.List;
import static spark.Spark.*;

public class RestAPI {

    public static void main(String[] args) {
        get("/geolocation/:city", (request, response) -> {
            String s = "s";
            return s;
        });

        get("/bookAndAuthor/:city", (request, response) -> {
            String city = request.params("city");
            SqlDB sqlDB = new SqlDB();
            List<Book> booksAndAuthors = sqlDB.GetBookAndAuthor(city);
            return booksAndAuthors;
        });

        get("/citiesFromBooks/:book", (request, response) -> {
            String book = request.params("book");
            SqlDB sqlDB = new SqlDB();
            List<City> citiesFromBook = sqlDB.PlotCitiesFromBook(book);
            return citiesFromBook;        
        });

        get("/citiesFromAuthor/:author", (request, response) -> {
            String author = request.params("author");
            SqlDB sqlDB = new SqlDB();
            List<City> citiesFromAuthor = sqlDB.PlotCitiesFromAuthor(author);
            return citiesFromAuthor;        
                
        });

    }

}