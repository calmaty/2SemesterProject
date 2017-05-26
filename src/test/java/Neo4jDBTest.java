
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Neo4jDBTest {

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

    public Neo4jDBTest() {
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
        
        Neo4jDB psql = new Neo4jDB();
        String city = "London";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime1 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 1 " +totalTime1 );
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor2() {
        Neo4jDB psql = new Neo4jDB();
        String city = "Westminster";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime2 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 2 " +totalTime2 );
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor3() {
        Neo4jDB psql = new Neo4jDB();
        String city = "Mainz";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime3 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 3 " +totalTime3 );
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor4() {
        Neo4jDB psql = new Neo4jDB();
        String city = "Newport";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime4 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 4 " +totalTime4 );
        assertEquals(true, yes);

    }

    @Test
    public void getBookAndAuthor5() {
        Neo4jDB psql = new Neo4jDB();
        String city = "Damascus";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<Book> resultList = psql.GetBookAndAuthor(city);
        long endTime = System.currentTimeMillis();
        totalTime5 = endTime - startTime;

        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 5 " +totalTime5 );
        assertEquals(true, yes);

    }

    @Test
    public void getPlotCitiesFromBook1() {
        Neo4jDB psql = new Neo4jDB();
        String BookName = "`Abdu  l-Bahá in London";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime6 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 6 " +totalTime6 );
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook2() {
        Neo4jDB psql = new Neo4jDB();
        String BookName = "Beltane the Smith";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime7 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 7 " +totalTime7 );
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook3() {
        Neo4jDB psql = new Neo4jDB();
        String BookName = "Tenterhooks";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime8 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 8 " +totalTime8 );
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook4() {
        Neo4jDB psql = new Neo4jDB();
        String BookName = "Poems";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime9 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 9 " +totalTime9 );
        assertEquals(true, yes);
    }

    @Test
    public void getPlotCitiesFromBook5() {
        Neo4jDB psql = new Neo4jDB();
        String BookName = "Happiness and Marriage";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<City> resultList = psql.PlotCitiesFromBook(BookName);
        long endTime = System.currentTimeMillis();
        totalTime10 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 10 " +totalTime10 );
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor1() {
        Neo4jDB psql = new Neo4jDB();
        String AuthorName = "`Abdu  l-Bahá";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime11 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 11 " +totalTime11 );
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor2() {
        Neo4jDB psql = new Neo4jDB();
        String AuthorName = "A-No. 1";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime12 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 12 " +totalTime12 );
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor3() {
        Neo4jDB psql = new Neo4jDB();
        String AuthorName = "A. L. O. E.";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime13 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 13 " +totalTime1);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor4() {
        Neo4jDB psql = new Neo4jDB();
        String AuthorName = "Sophocles";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime14 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 14 " +totalTime14);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromAuthor5() {
        Neo4jDB psql = new Neo4jDB();
        String AuthorName = "Euripides";
        boolean yes = false;
        long startTime = System.currentTimeMillis();
        List<EverythingByAuthor> resultList = psql.PlotCitiesAndBooksFromAuthor(AuthorName);
        long endTime = System.currentTimeMillis();
        totalTime15 = endTime - startTime;
        if (!resultList.isEmpty()) {
            yes = true;
        }
        System.out.println("Time for test 15 " +totalTime15);
        assertEquals(true, yes);
    }

    @Test
    public void getcitiesFromLocation1() {
        Neo4jDB psql = new Neo4jDB();
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
        Neo4jDB psql = new Neo4jDB();
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
        Neo4jDB psql = new Neo4jDB();
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
        Neo4jDB psql = new Neo4jDB();
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
        Neo4jDB psql = new Neo4jDB();
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
    
   
    
     @Test
    public void testGetBookAndAuthor() {
        System.out.println("GetBookAndAuthor");
        String Name = "London";
        Neo4jDB instance = new Neo4jDB();
        List<Book> expResult = new ArrayList<>();
        Book b1 = new Book("Søren Nielsen", "Phantom");
        expResult.add(b1);
        List<Book> result = instance.GetBookAndAuthor(Name);
        assertEquals(expResult.get(0).Author, result.get(0).Author);

          
    }
    
    @Test
    public void testGetBookAndAuthorNoInput()
    {
        Neo4jDB instance = new Neo4jDB();
        List<Book> books =  instance.GetBookAndAuthor("");
        assertEquals(books.get(0).Title, "No Books Found");
    }
    
    @Test
    public void testGetBookAndAuthorNothingFound()
    {
        Neo4jDB instance = new Neo4jDB();
        List<Book> books =  instance.GetBookAndAuthor("sjjjjl");
        assertEquals(books.get(0).Title, "No Books Found");
    }
    @Test
    public void testGetBookAndAuthorWrongInput()
    {
        Neo4jDB instance = new Neo4jDB();
        List<Book> books =  instance.GetBookAndAuthor("h3lp");
        assertEquals(books.get(0).Title, "No Books Found");
    }
    
    @Test
    public void testGetBookAndAuthorStump() {
        System.out.println("GetBookAndAuthor");
        String Name = "London";
        StumpDB instance = new StumpDB();
        List<Book> expResult = new ArrayList<>();
        Book b1 = new Book("Søren Nielsen", "Phantom");
        expResult.add(b1);
        List<Book> result = instance.GetBookAndAuthor(Name);
        assertEquals(expResult.get(0).Author, result.get(0).Author);
    }
    
    @Test
    public void testGetBookAndAuthorNoInputStump()
    {
        StumpDB instance = new StumpDB();
        List<Book> books =  instance.GetBookAndAuthor("");
        assertEquals(books.get(0).Title, "No Books Found");
    }
    @Test
    public void testGetBookAndAuthorWrongInputStump()
    {
        StumpDB instance = new StumpDB();
        List<Book> books =  instance.GetBookAndAuthor("h3lp");
        assertEquals(books.get(0).Title, "No Books Found");
    }

    /**
     * Test of PlotCitiesFromBook method, of class Neo4jDB.
     */
    @Test
    public void testPlotCitiesFromBookStump() {
        System.out.println("PlotCitiesFromBook");
        String BookName = "phantom";
        StumpDB instance = new StumpDB();
        List<City> expResult = new ArrayList<City>();
        City c1 = new City("London", new GeoLocation());
        City c2 = new City("New York", new GeoLocation());
        expResult.add(c1);
        expResult.add(c2);
        List<City> result = instance.PlotCitiesFromBook(BookName);
        assertEquals(expResult.get(0).Name, result.get(0).Name);
        assertEquals(expResult.get(1).Name, result.get(1).Name);
    }
    
     @Test
    public void  testPlotCitiesFromBookNoInputStump()
    {
        StumpDB instance = new StumpDB();
        List<City> cities =  instance.PlotCitiesFromBook("");
        assertEquals(cities.get(0).Name, "No City Found");
    }
    @Test
    public void  testPlotCitiesFromBookWrongInputStump()
    {
        StumpDB instance = new StumpDB();
        List<City> cities =  instance.PlotCitiesFromBook("h3lp");
        assertEquals(cities.get(0).Name, "No City Found");
    }
    
    @Test
    public void testPlotCitiesFromBookNothingFound()
    {
        StumpDB instance = new StumpDB();
        List<City> cities =  instance.PlotCitiesFromBook("sjjjjl");
        assertEquals(cities.get(0).Name, "No City Found");
    }
    
    @Test
    public void testPlotCitiesFromAuthorStump() {
        String BookName = "Søren Nielsen";
        StumpDB instance = new StumpDB();
        List<City> expResult = new ArrayList<City>();
        City c1 = new City("London", new GeoLocation());
        City c2 = new City("New York", new GeoLocation());
        expResult.add(c1);
        expResult.add(c2);
        List<EverythingByAuthor> result = instance.PlotCitiesAndBooksFromAuthor(BookName);
        assertEquals(expResult.get(0).Name, result.get(0).cityName);
        assertEquals(expResult.get(1).Name, result.get(1).cityName);
    }
    
     @Test
    public void  testPlotCitiesFromaAuthorNoInputStump()
    {
        StumpDB instance = new StumpDB();
        List<EverythingByAuthor> cities =  instance.PlotCitiesAndBooksFromAuthor("");
        assertEquals(cities.get(0).cityName, "No City Found");
    }
    @Test
    public void  testPlotCitiesFromAuthorWrongInputStump()
    {
         StumpDB instance = new StumpDB();
        List<EverythingByAuthor> cities =  instance. PlotCitiesAndBooksFromAuthor("h3lp");
        assertEquals(cities.get(0).cityName, "No City Found");
    }
    
    @Test
    public void testPlotCitiesFromAuthorNothingFound()
    {
        StumpDB instance = new StumpDB();
        List<EverythingByAuthor> cities =  instance. PlotCitiesAndBooksFromAuthor("sjjjjl");
        assertEquals(cities.get(0).cityName, "No City Found");
    }
  
    @Test
    public void testGetBooksByLocationStump()
    {
        GeoLocation location = new GeoLocation(1f,1f);
        StumpDB instance = new StumpDB();
        List<Book> expResult = new ArrayList<>();
        Book b1 = new Book("Søren Nielsen", "Phantom");
        expResult.add(b1);
        List<Book> result = instance.GetBooksByLocation(location);
        assertEquals(expResult.get(0).Author, result.get(0).Author);
    }
    
    @Test
    public void testGetBooksByLocationNegativeInputStump()
    {
        GeoLocation location = new GeoLocation(-1f,-1f);
        StumpDB instance = new StumpDB();
        List<Book> books =  instance.GetBooksByLocation(location);
        assertEquals(books.get(0).Title, "No Books Found");
    }
    
    @Test
    public void testGetBooksByLocationWrongInputStump()
    {
        GeoLocation location = new GeoLocation(7,3);
        StumpDB instance = new StumpDB();
        List<Book> books =  instance.GetBooksByLocation(location);
        assertEquals(books.get(0).Title, "No Books Found");
    }
    /**
     * Test of PlotCitiesFromAuthor method, of class Neo4jDB.
     */
    @Test
    public void testPlotCitiesFromAuthor() {
        System.out.println("PlotCitiesFromAuthor");
        String AuthorName = "Søren Nielsen";
        Neo4jDB instance = new Neo4jDB();
        List<City> expResult = new ArrayList<>();
         City c1 = new City("New York", new GeoLocation());
        City c2 = new City("London", new GeoLocation());
        expResult.add(c1);
        expResult.add(c2);
        List<EverythingByAuthor> result = instance.PlotCitiesAndBooksFromAuthor(AuthorName);
         assertEquals(expResult.get(0).Name, result.get(0).cityName);
        assertEquals(expResult.get(1).Name, result.get(1).cityName);
    }
    
     @Test
        public void testPlotCitiesFromBook() {
        System.out.println("PlotCitiesFromBook");
        String BookName = "Phantom";
        Neo4jDB instance = new Neo4jDB();
        List<City> expResult = new ArrayList<>();
        City c1 = new City("New York", new GeoLocation());
        City c2 = new City("London", new GeoLocation());
        expResult.add(c1);
        expResult.add(c2);
        List<City> result = instance.PlotCitiesFromBook(BookName);
        assertEquals(expResult.get(0).Name, result.get(0).Name);
        assertEquals(expResult.get(1).Name, result.get(1).Name);
    }

    /**
     * Test of GetBooksByLocation method, of class Neo4jDB.
     */
    @Test
    public void testGetBooksByLocation() {
        System.out.println("GetBooksByLocation");
        GeoLocation Location = new GeoLocation(42.2f,42.2f);
        Neo4jDB instance = new Neo4jDB();
        List<Book> expResult = new ArrayList<Book>();
        List<Book> result = instance.GetBooksByLocation(Location);
        Book b1 = new Book("Søren Nielsen", "Phantom");
        expResult.add(b1);
        assertEquals(expResult.get(0).Author, result.get(0).Author);
    }
}
