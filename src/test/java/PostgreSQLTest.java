
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void getBookAndAuthor() {
        SqlDB psql = new SqlDB();
        String city = "London";
        List<Book> books = new ArrayList<>();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        Book b1 = new Book("Søren Nielsen", "Phantom");
        Book b2 = new Book("Hans Bostrup", "Jægeren");
        books.add(b1);
        books.add(b2);
        boolean yes = books.containsAll(resultList);
        assertEquals(true, yes);

    }

    @Test
    public void getPlotCitiesFromBook() {
        SqlDB psql = new SqlDB();
        String BookName = "phantom";
        List<City> cities = new ArrayList<>();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        City c1 = new City("London", new GeoLocation());
        City c2 = new City("New York", new GeoLocation());
        cities.add(c1);
        cities.add(c2);
        boolean yes = cities.containsAll(resultList);
        assertEquals(true, yes);

    }

    @Test
    public void getcitiesFromAuthor() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Søren Nielsen";
        List<City> cities = new ArrayList<>();
        List<City> resultList = psql.PlotCitiesFromAuthor(AuthorName);
        City c1 = new City("London", new GeoLocation());
        City c2 = new City("New York", new GeoLocation());
        cities.add(c1);
        cities.add(c2);
        boolean yes = cities.containsAll(resultList);
        assertEquals(true, yes);

    }
}
