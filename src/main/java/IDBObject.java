
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoffer
 */
public interface IDBObject {
    
public List<Book> GetBookAndAuthor(String CityName);

public List<City> PlotCitiesFromBook(String BookName);

public List<EverythingByAuthor> PlotCitiesAndBooksFromAuthor(String AuthorFirstName ,String AuthorLastName);

public List<Book> GetBooksByLocation (GeoLocation Location);

}
