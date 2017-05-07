/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christoffer
 */
public class Neo4jDBTest {
    
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
    /**
     * Test of GetBookAndAuthor method, of class Neo4jDB.
     */
    @Test
    public void testGetBookAndAuthor() {
        System.out.println("GetBookAndAuthor");
        String CityName = "London";
        Neo4jDB instance = new Neo4jDB();
        List<Book> expResult = new ArrayList<Book>();
        Book b1 = new Book("Søren Nielsen", "Phantom");
        Book b2 = new Book("Hans Bostrup", "Jægeren");
        expResult.add(b1);
        expResult.add(b2);
        List<Book> result = instance.GetBookAndAuthor(CityName);
        assertEquals(expResult, result);
    }

    /**
     * Test of PlotCitiesFromBook method, of class Neo4jDB.
     */
    @Test
    public void testPlotCitiesFromBook() {
        System.out.println("PlotCitiesFromBook");
        String BookName = "phantom";
        Neo4jDB instance = new Neo4jDB();
        List<City> expResult = new ArrayList<City>();
        City c1 = new City("London", new GeoLocation());
        City c2 = new City("New York", new GeoLocation());
        expResult.add(c1);
        expResult.add(c2);
        List<City> result = instance.PlotCitiesFromBook(BookName);
        assertEquals(expResult, result);
    }

    /**
     * Test of PlotCitiesFromAuthor method, of class Neo4jDB.
     */
    @Test
    public void testPlotCitiesFromAuthor() {
        System.out.println("PlotCitiesFromAuthor");
        String AuthorName = "Søren Nielsen";
        Neo4jDB instance = new Neo4jDB();
        List<City> expResult = null;
         City c1 = new City("London", new GeoLocation());
        City c2 = new City("New York", new GeoLocation());
        expResult.add(c1);
        expResult.add(c2);
        List<City> result = instance.PlotCitiesFromAuthor(AuthorName);
        assertEquals(expResult, result);
    }

    /**
     * Test of GetBooksByLocation method, of class Neo4jDB.
     */
    @Test
    public void testGetBooksByLocation() {
        System.out.println("GetBooksByLocation");
        GeoLocation Location = new GeoLocation();
        Neo4jDB instance = new Neo4jDB();
        List<Book> expResult = new ArrayList<Book>();
        List<Book> result = instance.GetBooksByLocation(Location);
        Book b1 = new Book("Søren Nielsen", "Phantom");
        Book b2 = new Book("Hans Bostrup", "Jægeren");
        expResult.add(b1);
        expResult.add(b2);
        assertEquals(expResult, result);
    }
    
}
