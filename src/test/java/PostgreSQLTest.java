
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostgreSQLTest {

    public PostgreSQLTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

//    @Test
//    public void getBookAndAuthor() {
//        SqlDB psql = new SqlDB();
//        String city = "kkkk";
//        List<Book> books = new ArrayList<>();
//        List<Book> resultList = psql.GetBookAndAuthor(city);
//        Book b1 = new Book("e eeeee", "rr");
//        Book b2 = new Book("e eeeee", "rr");
//        books.add(b1);
//        books.add(b2);
//        boolean yes = books.containsAll(resultList);
//        assertEquals(true, yes);
//
//    }
//
//    @Test
//    public void getPlotCitiesFromBook() {
//        SqlDB psql = new SqlDB();
//        String BookName = "zz";
//        List<City> cities = new ArrayList<>();
//        List<City> resultList = psql.PlotCitiesFromBook(BookName);
//        GeoLocation gl = new GeoLocation();
//        gl.setLatitude((float) 42.46372);
//        gl.setLongitude((float) 1.49129);
//        City c1 = new City("xxxx", gl);
//        cities.add(c1);
//        boolean yes = cities.containsAll(resultList);
//        assertEquals(true, yes);
//
//    }

//    @Test
//    public void getcitiesFromAuthor() {
//        SqlDB psql = new SqlDB();
//        String AuthorName = "Søren Nielsen";
//        List<City> cities = new ArrayList<>();
//        List<City> resultList = psql.PlotCitiesFromAuthor(AuthorName);
//        City c1 = new City("London", new GeoLocation());
//        City c2 = new City("New York", new GeoLocation());
//        cities.add(c1);
//        cities.add(c2);
//        boolean yes = cities.containsAll(resultList);
//        assertEquals(true, yes);
//
//    }
//    
//    @Test
//    public void getcitiesFromLocation() {
//        SqlDB psql = new SqlDB();
//        String AuthorName = "Søren Nielsen";
//        List<City> cities = new ArrayList<>();
//        List<City> resultList = psql.PlotCitiesFromAuthor(AuthorName);
//        City c1 = new City("London", new GeoLocation());
//        City c2 = new City("New York", new GeoLocation());
//        cities.add(c1);
//        cities.add(c2);
//        boolean yes = cities.containsAll(resultList);
//        assertEquals(true, yes);
//
//    }

//    @Test
//    public void restGetBookAndAuthor() {
//        get("http://localhost:8080/bookAndAuthor/London").then()
//                .assertThat().body("books", hasItem("Søren Nielsen"));
//    }
//
//    @Test
//    public void restGetCitiesFromBook() {
//        get("http://localhost:8080/CitiesFromBooks/phantom").then()
//                .assertThat().body("cities", hasItem("London"));
//    }
//
//    @Test
//    public void restGetCitiesFromAuthor() {
//        get("http://localhost:8080/citiesFromAuthor/SørenNielsen").then()
//                .assertThat().body("cities", hasItem("London"));
//    }
}



