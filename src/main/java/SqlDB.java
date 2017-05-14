
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class SqlDB implements DBObject {

    @Override
    public List<Book> GetBookAndAuthor(String CityName) {
        List<Book> booksAndAuthors = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "Select * from Person;";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {

        }

        return booksAndAuthors;

    }

    @Override
    public List<City> PlotCitiesFromBook(String BookName) {
        List<City> citiesFromBook = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "Select * from Person;";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {

        }

        return citiesFromBook;

    }

    @Override
    public List<City> PlotCitiesFromAuthor(String AuthorName) {
        List<City> citiesFromAuthor = new ArrayList<>();
        Connection con = SqlConnection.getConnection();
        String sql = "Select * from Person;";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            rs.close();
            preparedStatement.close();
            SqlConnection.releaseConnection(con);
        } catch (SQLException e) {

        }

        return citiesFromAuthor;

    }

    @Override
    public List<Book> GetBooksByLocation(GeoLocation Location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
