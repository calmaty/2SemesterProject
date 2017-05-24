
import java.util.ArrayList;
import java.util.List;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import static org.neo4j.driver.v1.Values.parameters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoffer
 */
public class Neo4jDB implements IDBObject {
    
    Driver driver;
    
    public Neo4jDB(){   
    driver = GraphDatabase.driver(
                "bolt://127.0.0.1:7687",
                AuthTokens.basic( "neo4j", "123" ) );
    }
     

        @Override
        public List<Book> GetBookAndAuthor(String CityName) {
          List<Book> books = new ArrayList<>();  
         
          if(CityName == "" || CityName.matches(".*\\d+.*") )
          {
              Book b = new Book("No Books Found","No Books Found"); 
              books.add(b);
          }
          else
          {
                Session session = driver.session();
                StatementResult result = session.run(
                    "MATCH (a:Author)-[w:Wrote]->(b:Book)-[m:Mentions]->(c:City) " +
                    "WHERE c.name = " + "\""+CityName+"\"" +
                    " RETURN  b.title AS title, a.name AS author");
                        //"MATCH (b:Book)-[m:Mentions]->(c:City) WHERE c.name = {name} RETURN b", parameters("name","London"));
            while ( result.hasNext() ) {
            Record record = result.next();
            System.out.println(record.get("author").asString());
            Book b;
            b = new Book(record.get("author").asString(), record.get("title").asString());
            books.add(b);
        }
          
          session.close();
          driver.close();
          }
          
          if(books.isEmpty())
          {
              Book b = new Book("No Books Found","No Books Found"); 
              books.add(b);
          }
          
          return books;
    }

    @Override
    public List<City> PlotCitiesFromBook(String BookName) {
    List<City> cities = new ArrayList<>();  
         
          if(BookName == "" || BookName.matches(".*\\d+.*"))
          {
              City c = new City("No City Found", new GeoLocation()); 
              cities.add(c);
          }
          else 
          {
             Session session = driver.session();
                StatementResult result = session.run(
                    "MATCH (a:Author)-[w:Wrote]->(b:Book)-[m:Mentions]->(c:City) " +
                    "WHERE b.title = " + "\""+BookName+"\"" +
                    " RETURN  c.name AS name");
                        //"MATCH (b:Book)-[m:Mentions]->(c:City) WHERE c.name = {name} RETURN b", parameters("name","London"));
            while ( result.hasNext() ) {
            Record record = result.next();
            System.out.println(record.get("author").asString());
            City c = new City(record.get("name").asString(), new GeoLocation()); 
            cities.add(c);
            }
          }
          
          if(cities.isEmpty())
          {
              City c = new City("No City Found", new GeoLocation()); 
              cities.add(c);
          }
           return cities;    
        }

    @Override
    public List<EverythingByAuthor> PlotCitiesAndBooksFromAuthor(String AuthorName) {
         //List<City> cities = new ArrayList<>();
         List<EverythingByAuthor> Everylist = new ArrayList<>();
         
          if(AuthorName == "" || AuthorName.matches(".*\\d+.*"))
          {
//              City c = new City("No City Found", new GeoLocation()); 
//              cities.add(c);
              EverythingByAuthor EBA = new EverythingByAuthor("No Books Found", "No City Found", 0f,0f);
            Everylist.add(EBA);
          }
          else 
          {
              Session session = driver.session();
                StatementResult result = session.run(
                    "MATCH (a:Author)-[w:Wrote]->(b:Book)-[m:Mentions]->(c:City) " +
                    "WHERE a.name = " + "\""+AuthorName+"\"" +
                    " RETURN  b.title AS title, c.name AS name, c.latitude AS latitude, c.longitude AS longitude");
                        //"MATCH (b:Book)-[m:Mentions]->(c:City) WHERE c.name = {name} RETURN b", parameters("name","London"));
            while ( result.hasNext() ) {
            Record record = result.next();
//            City c = new City(record.get("name").asString(), new GeoLocation()); 
//            cities.add(c);
            EverythingByAuthor EBA = new EverythingByAuthor(record.get("title").asString(), record.get("name").asString(), record.get("latitude").asFloat(), record.get("longitude").asFloat());
            Everylist.add(EBA);
            }
          }
          if(Everylist.isEmpty())
          {
//              City c = new City("No City Found", new GeoLocation()); 
//              cities.add(c);
              EverythingByAuthor EBA = new EverythingByAuthor("No Books Found", "No City Found", 0f,0f);
            Everylist.add(EBA);
          }
           return Everylist;
    }

    @Override
    public List<Book> GetBooksByLocation(GeoLocation Location) {
         List<Book> books = new ArrayList<>();  
         
          if(Location.longitude <=0 || Location.latitude <= 0 )
          {
              Book b = new Book("No Books Found","No Books Found"); 
              books.add(b);
          }
          else 
          {
              Session session = driver.session();
                StatementResult result = session.run(
                  "MATCH (a:Author)-[w:Wrote]->(b:Book)-[m:Mentions]->(c:City) " +
                  "WITH point({ longitude: c.longitude, latitude: c.latitude }) AS aPoint, point({ longitude: " + Location.longitude + 
                  ", latitude: " + Location.latitude + "}) AS bPoint, a, b " +
                  "WITH DISTINCT round(distance(aPoint, bPoint)) AS distance, a, b " +
                  "WHERE distance < 1000 " +
                  "RETURN DISTINCT a.name as author, b.title as title");
                        //"MATCH (b:Book)-[m:Mentions]->(c:City) WHERE c.name = {name} RETURN b", parameters("name","London"));
            while ( result.hasNext() ) {
            Record record = result.next();
            System.out.println(record.get("author").asString());
            Book b;
            b = new Book(record.get("author").asString(), record.get("title").asString());
            books.add(b);
            }
        }
          if(books.isEmpty())
          {
              Book b = new Book("No Books Found","No Books Found"); 
              books.add(b);
          }
           return books;
    }
}
