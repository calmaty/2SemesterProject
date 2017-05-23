///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import static org.mockito.Mockito.when;
//import org.mockito.MockitoAnnotations;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.neo4j.driver.v1.Driver;
//import org.neo4j.driver.v1.GraphDatabase;
//import org.neo4j.driver.v1.Record;
//import org.neo4j.driver.v1.Session;
//import org.neo4j.driver.v1.StatementResult;
//
///**
// *
// * @author Christoffer
// */
//@RunWith(MockitoJUnitRunner.class)
//public class Neo4jDBTest {
//    
//    public Neo4jDBTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//    /**
//     * Test of GetBookAndAuthor method, of class Neo4jDB.
//     */
//    
////    @Mock
////    GraphDatabase GDMock;
//      
////    @Mock
////    Driver driverMock;
////    
////    @Mock
////    Session sessionMock;
////    
////    @Mock
////    StatementResult resultMock;
////    
////    @Mock
////    Record recordMock;
//    
//    @Test
//    public void testGetBookAndAuthor() {
//        System.out.println("GetBookAndAuthor");
//        String Name = "London";
//        Neo4jDB instance = new Neo4jDB();
//        List<Book> expResult = new ArrayList<>();
//        Book b1 = new Book("Søren Nielsen", "Phantom");
//        expResult.add(b1);
//        List<Book> result = instance.GetBookAndAuthor(Name);
//        assertEquals(expResult.get(0).Author, result.get(0).Author);
//
//          
//    }
//    
//    @Test
//    public void testGetBookAndAuthorNoInput()
//    {
//        Neo4jDB instance = new Neo4jDB();
//        List<Book> books =  instance.GetBookAndAuthor("");
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
//    
//    @Test
//    public void testGetBookAndAuthorNothingFound()
//    {
//        Neo4jDB instance = new Neo4jDB();
//        List<Book> books =  instance.GetBookAndAuthor("sjjjjl");
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
//    @Test
//    public void testGetBookAndAuthorWrongInput()
//    {
//        Neo4jDB instance = new Neo4jDB();
//        List<Book> books =  instance.GetBookAndAuthor("h3lp");
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
//    
//    @Test
//    public void testGetBookAndAuthorStump() {
//        System.out.println("GetBookAndAuthor");
//        String Name = "London";
//        StumpDB instance = new StumpDB();
//        List<Book> expResult = new ArrayList<>();
//        Book b1 = new Book("Søren Nielsen", "Phantom");
//        expResult.add(b1);
//        List<Book> result = instance.GetBookAndAuthor(Name);
//        assertEquals(expResult.get(0).Author, result.get(0).Author);
//    }
//    
//    @Test
//    public void testGetBookAndAuthorNoInputStump()
//    {
//        StumpDB instance = new StumpDB();
//        List<Book> books =  instance.GetBookAndAuthor("");
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
//    @Test
//    public void testGetBookAndAuthorWrongInputStump()
//    {
//        StumpDB instance = new StumpDB();
//        List<Book> books =  instance.GetBookAndAuthor("h3lp");
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
//
////    /**
////     * Test of PlotCitiesFromBook method, of class Neo4jDB.
////     */
//    @Test
//    public void testPlotCitiesFromBookStump() {
//        System.out.println("PlotCitiesFromBook");
//        String BookName = "phantom";
//        StumpDB instance = new StumpDB();
//        List<City> expResult = new ArrayList<City>();
//        City c1 = new City("London", new GeoLocation());
//        City c2 = new City("New York", new GeoLocation());
//        expResult.add(c1);
//        expResult.add(c2);
//        List<City> result = instance.PlotCitiesFromBook(BookName);
//        assertEquals(expResult.get(0).Name, result.get(0).Name);
//        assertEquals(expResult.get(1).Name, result.get(1).Name);
//    }
//    
//     @Test
//    public void  testPlotCitiesFromBookNoInputStump()
//    {
//        StumpDB instance = new StumpDB();
//        List<City> cities =  instance.PlotCitiesFromBook("");
//        assertEquals(cities.get(0).Name, "No City Found");
//    }
//    @Test
//    public void  testPlotCitiesFromBookWrongInputStump()
//    {
//        StumpDB instance = new StumpDB();
//        List<City> cities =  instance.PlotCitiesFromBook("h3lp");
//        assertEquals(cities.get(0).Name, "No City Found");
//    }
//    
//    @Test
//    public void testPlotCitiesFromBookNothingFound()
//    {
//        StumpDB instance = new StumpDB();
//        List<City> cities =  instance.PlotCitiesFromBook("sjjjjl");
//        assertEquals(cities.get(0).Name, "No City Found");
//    }
//    
//    @Test
//    public void testPlotCitiesFromAuthorStump() {
//        String BookName = "Søren Nielsen";
//        StumpDB instance = new StumpDB();
//        List<City> expResult = new ArrayList<City>();
//        City c1 = new City("London", new GeoLocation());
//        City c2 = new City("New York", new GeoLocation());
//        expResult.add(c1);
//        expResult.add(c2);
//        List<City> result = instance.PlotCitiesFromAuthor(BookName);
//        assertEquals(expResult.get(0).Name, result.get(0).Name);
//        assertEquals(expResult.get(1).Name, result.get(1).Name);
//    }
//    
//     @Test
//    public void  testPlotCitiesFromaAuthorNoInputStump()
//    {
//        StumpDB instance = new StumpDB();
//        List<City> cities =  instance.PlotCitiesFromAuthor("");
//        assertEquals(cities.get(0).Name, "No City Found");
//    }
//    @Test
//    public void  testPlotCitiesFromAuthorWrongInputStump()
//    {
//        StumpDB instance = new StumpDB();
//        List<City> cities =  instance.PlotCitiesFromAuthor("h3lp");
//        assertEquals(cities.get(0).Name, "No City Found");
//    }
//    
//    @Test
//    public void testPlotCitiesFromAuthorNothingFound()
//    {
//        StumpDB instance = new StumpDB();
//        List<City> cities =  instance.PlotCitiesFromAuthor("sjjjjl");
//        assertEquals(cities.get(0).Name, "No City Found");
//    }
////  
//    @Test
//    public void testGetBooksByLocationStump()
//    {
//        GeoLocation location = new GeoLocation(1f,1f);
//        StumpDB instance = new StumpDB();
//        List<Book> expResult = new ArrayList<>();
//        Book b1 = new Book("Søren Nielsen", "Phantom");
//        expResult.add(b1);
//        List<Book> result = instance.GetBooksByLocation(location);
//        assertEquals(expResult.get(0).Author, result.get(0).Author);
//    }
//    
//    @Test
//    public void testGetBooksByLocationNegativeInputStump()
//    {
//        GeoLocation location = new GeoLocation(-1f,-1f);
//        StumpDB instance = new StumpDB();
//        List<Book> books =  instance.GetBooksByLocation(location);
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
//    
//    @Test
//    public void testGetBooksByLocationWrongInputStump()
//    {
//        GeoLocation location = new GeoLocation(7,3);
//        StumpDB instance = new StumpDB();
//        List<Book> books =  instance.GetBooksByLocation(location);
//        assertEquals(books.get(0).Title, "No Books Found");
//    }
////    /**
////     * Test of PlotCitiesFromAuthor method, of class Neo4jDB.
////     */
//    @Test
//    public void testPlotCitiesFromAuthor() {
//        System.out.println("PlotCitiesFromAuthor");
//        String AuthorName = "Søren Nielsen";
//        Neo4jDB instance = new Neo4jDB();
//        List<City> expResult = new ArrayList<>();
//         City c1 = new City("New York", new GeoLocation());
//        City c2 = new City("London", new GeoLocation());
//        expResult.add(c1);
//        expResult.add(c2);
//        List<City> result = instance.PlotCitiesFromAuthor(AuthorName);
//         assertEquals(expResult.get(0).Name, result.get(0).Name);
//        assertEquals(expResult.get(1).Name, result.get(1).Name);
//    }
//    
//     @Test
//        public void testPlotCitiesFromBook() {
//        System.out.println("PlotCitiesFromBook");
//        String BookName = "Phantom";
//        Neo4jDB instance = new Neo4jDB();
//        List<City> expResult = new ArrayList<>();
//        City c1 = new City("New York", new GeoLocation());
//        City c2 = new City("London", new GeoLocation());
//        expResult.add(c1);
//        expResult.add(c2);
//        List<City> result = instance.PlotCitiesFromBook(BookName);
//        assertEquals(expResult.get(0).Name, result.get(0).Name);
//        assertEquals(expResult.get(1).Name, result.get(1).Name);
//    }
//
//    /**
//     * Test of GetBooksByLocation method, of class Neo4jDB.
//     */
//    @Test
//    public void testGetBooksByLocation() {
//        System.out.println("GetBooksByLocation");
//        GeoLocation Location = new GeoLocation(42.2f,42.2f);
//        Neo4jDB instance = new Neo4jDB();
//        List<Book> expResult = new ArrayList<Book>();
//        List<Book> result = instance.GetBooksByLocation(Location);
//        Book b1 = new Book("Søren Nielsen", "Phantom");
//        expResult.add(b1);
//        assertEquals(expResult.get(0).Author, result.get(0).Author);
//    }
//    
//}
