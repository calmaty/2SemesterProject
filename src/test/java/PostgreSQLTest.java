
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
        String city = "London";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime1 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 1 " + totalTime1);
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor2() {
        SqlDB psql = new SqlDB();
        String city = "Westminster";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime2 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 2 " + totalTime2);
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor3() {
        SqlDB psql = new SqlDB();
        String city = "Mainz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime3 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 3 " + totalTime3);
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor4() {
        SqlDB psql = new SqlDB();
        String city = "Newport";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime4 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 4 " + totalTime4);
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor5() {
        SqlDB psql = new SqlDB();
        String city = "Damascus";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime5 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 5 " + totalTime5);
        assertEquals(true, yes);

    }
    @Test
    public void getPlotCitiesFromBook1() {
        SqlDB psql = new SqlDB();
        String BookName = "`Abdu  l-Bahá in London";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime6 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 6 " + totalTime6);
        assertEquals(true, yes);
    }
    @Test
    public void getPlotCitiesFromBook2() {
        SqlDB psql = new SqlDB();
        String BookName = "Beltane the Smith";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime7 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 7 " + totalTime7);
        assertEquals(true, yes);
    }
    

    @Test
    public void getPlotCitiesFromBook3() {
        SqlDB psql = new SqlDB();
        String BookName = "Tenterhooks";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime8 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 8 " + totalTime8);
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook4() {
        SqlDB psql = new SqlDB();
        String BookName = "Poems";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime9 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 9 " + totalTime9);
        assertEquals(true, yes);
    }
    @Test
    public void getPlotCitiesFromBook5() {
        SqlDB psql = new SqlDB();
        String BookName = "Happiness and Marriage";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime10 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 10 " + totalTime10);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor1() {
        SqlDB psql = new SqlDB();
        String AuthorName = "`Abdu  l-Bahá";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime11 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 11 " + totalTime11);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor2() {
        SqlDB psql = new SqlDB();
        String AuthorName = "A-No. 1";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime12 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 12 " + totalTime12);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor3() {
        SqlDB psql = new SqlDB();
        String AuthorName = "A. L. O. E.";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime13 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 13 " + totalTime13);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor4() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Sophocles";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime14 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 14 " + totalTime14);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor5() {
        SqlDB psql = new SqlDB();
        String AuthorName = "Euripides";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime15 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 15 " + totalTime15);
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
        System.out.println("Time for test 16 " + totalTime16);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation2() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(11f);
        gloc.setLongitude(-12f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime17 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 17 " + totalTime17);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation3() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(40f);
        gloc.setLongitude(16f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime18 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 18 " + totalTime18);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation4() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(32.20487f);
        gloc.setLongitude(-95.85552f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime19 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 19 " + totalTime19);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation5() {
        SqlDB psql = new SqlDB();
        GeoLocation gloc = new GeoLocation();
        gloc.setLatitude(34.25704f);
        gloc.setLongitude(-85.16467f);
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBooksByLocation(gloc);
        long endTime = System.currentTimeMillis();
        totalTime20 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 20 " + totalTime20);
        assertEquals(true, yes);
    }
}
