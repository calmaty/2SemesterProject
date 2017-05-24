
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PostgreSQLTest {

    long totalTime1;
    long totalTime2;
    long totalTime3;
    long totalTime4;
    long totalTime5;
    long totalTime6;
    long totalTime7;
    long totalTime8;
    long totalTime9;
    long totalTime10;
    long totalTime11;
    long totalTime12;
    long totalTime13;
    long totalTime14;
    long totalTime15;
    long totalTime16;
    long totalTime17;
    long totalTime18;
    long totalTime19;
    long totalTime20;

    public PostgreSQLTest() {
    }

    public void medianOfTests() {
        long averageFirstFive = (totalTime1 + totalTime2 + totalTime3 + totalTime4 + totalTime5) / 5;
        System.out.println(averageFirstFive);
        long averageSecondFive = (totalTime6 + totalTime7 + totalTime8 + totalTime9 + totalTime10) / 5;
        System.out.println(averageSecondFive);
        long averageThirdFive = (totalTime11 + totalTime12 + totalTime13 + totalTime14 + totalTime15) / 5;
        System.out.println(averageThirdFive);
        long averageFourthFive = (totalTime16 + totalTime17 + totalTime18 + totalTime19 + totalTime20) / 5;
        System.out.println(averageFourthFive);
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
    public void getBookAndAuthor1() {
        SqlDB psql = new SqlDB();
        String city = "kkkk";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime1 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor2() {
        SqlDB psql = new SqlDB();
        String city = "kkkk";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime2 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor3() {
        SqlDB psql = new SqlDB();
        String city = "kkkk";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime3 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor4() {
        SqlDB psql = new SqlDB();
        String city = "kkkk";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime4 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor5() {
        SqlDB psql = new SqlDB();
        String city = "kkkk";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime5 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);

    }

    @Test
    public void getPlotCitiesFromBook1() {
        SqlDB psql = new SqlDB();
        String BookName = "zz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime6 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook2() {
        SqlDB psql = new SqlDB();
        String BookName = "zz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime7 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook3() {
        SqlDB psql = new SqlDB();
        String BookName = "zz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime8 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook4() {
        SqlDB psql = new SqlDB();
        String BookName = "zz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime9 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook5() {
        SqlDB psql = new SqlDB();
        String BookName = "zz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime10 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor1() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Søren Nielsen";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime11 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor2() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Søren Nielsen";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime12 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor3() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Søren Nielsen";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime13 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor4() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Søren Nielsen";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime14 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor5() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Søren Nielsen";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime15 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation1() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(51.50853f);
        gloc.setLongitude(-0.12574f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime16 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation2() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(51.50853f);
        gloc.setLongitude(-0.12574f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime17 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation3() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(51.50853f);
        gloc.setLongitude(-0.12574f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime18 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation4() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(51.50853f);
        gloc.setLongitude(-0.12574f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime19 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation5() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(51.50853f);
        gloc.setLongitude(-0.12574f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime20 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        assertEquals(true, yes);
    }
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
