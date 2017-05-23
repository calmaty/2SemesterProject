/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoffer
 */
public class Book {
    
public String Title;
public String Author;

    public Book(String Title, String Author) {
        this.Title = Title;
        this.Author = Author;
    }

    public Book() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book{" + "Title=" + Title + ", Author=" + Author + '}';
    }
    
}
