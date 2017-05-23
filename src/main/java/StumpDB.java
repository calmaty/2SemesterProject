////
//import java.util.ArrayList;
//import java.util.List;
//import org.neo4j.driver.v1.Record;
//import org.neo4j.driver.v1.Session;
//import org.neo4j.driver.v1.StatementResult;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Christoffer
// */
//public class StumpDB implements IDBObject {
//
//    @Override
//        public List<Book> GetBookAndAuthor(String CityName) {
//          List<Book> books = new ArrayList<>();  
//         
//          if(CityName == "" || CityName.matches(".*\\d+.*") )
//          {
//              Book b = new Book("No Books Found","No Books Found"); 
//              books.add(b);
//          }
//          else 
//          {
//              if(CityName == "London")
//              {
//                   Book b1 = new Book("Søren Nielsen", "Phantom");
//                   books.add(b1);
//              }
//        }
//          if(books.isEmpty())
//          {
//              Book b = new Book("No Books Found","No Books Found"); 
//              books.add(b);
//          }
//           return books;
//    }
//
//    @Override
//    public List<City> PlotCitiesFromBook(String BookName) {
//       List<City> cities = new ArrayList<>();  
//         
//          if(BookName == "" || BookName.matches(".*\\d+.*"))
//          {
//              City c = new City("No City Found", new GeoLocation()); 
//              cities.add(c);
//          }
//          else 
//          {
//              if(BookName == "phantom")
//              {
//                    City c = new City("London", new GeoLocation()); 
//                    City c1 = new City("New York", new GeoLocation()); 
//                    cities.add(c);
//                    cities.add(c1);
//              }
//            }
//          
//          if(cities.isEmpty())
//          {
//              City c = new City("No City Found", new GeoLocation()); 
//              cities.add(c);
//          }
//           return cities;
//    }
//
//    @Override
//    public List<City> PlotCitiesFromAuthor(String AuthorName) {
//        List<City> cities = new ArrayList<>();  
//         
//          if(AuthorName == "" || AuthorName.matches(".*\\d+.*"))
//          {
//              City c = new City("No City Found", new GeoLocation()); 
//              cities.add(c);
//          }
//          else 
//          {
//              if(AuthorName == "Søren Nielsen")
//              {
//                    City c = new City("London", new GeoLocation()); 
//                    City c1 = new City("New York", new GeoLocation()); 
//                    cities.add(c);
//                    cities.add(c1);
//              }
//            }
//          
//          if(cities.isEmpty())
//          {
//              City c = new City("No City Found", new GeoLocation()); 
//              cities.add(c);
//          }
//           return cities;
//    }
//
//    @Override
//    public List<Book> GetBooksByLocation(GeoLocation Location) {
//           List<Book> books = new ArrayList<>();  
//         
//          if(Location.longitude <=0 || Location.latitude <= 0 )
//          {
//              Book b = new Book("No Books Found","No Books Found"); 
//              books.add(b);
//          }
//          else 
//          {
//              if(Location.latitude == 1 && Location.longitude == 1)
//              {
//                   Book b1 = new Book("Søren Nielsen", "Phantom");
//                   books.add(b1);
//              }
//        }
//          if(books.isEmpty())
//          {
//              Book b = new Book("No Books Found","No Books Found"); 
//              books.add(b);
//          }
//           return books;
//    }
//    
//}
