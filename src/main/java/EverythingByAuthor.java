/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author legendslayer
 */
public class EverythingByAuthor {

    String bookTitle;
    String cityName;

    public EverythingByAuthor(String bookTitle, String cityName, float cityLatitude, float cityLongitude) {
        this.bookTitle = bookTitle;
        this.cityName = cityName;
        this.cityLatitude = cityLatitude;
        this.cityLongitude = cityLongitude;
    }
    float cityLatitude;
    float cityLongitude;

    public EverythingByAuthor() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public float getCityLatitude() {
        return cityLatitude;
    }

    public void setCityLatitude(float cityLatitude) {
        this.cityLatitude = cityLatitude;
    }

    public float getCityLongitude() {
        return cityLongitude;
    }

    public void setCityLongitude(float cityLongitude) {
        this.cityLongitude = cityLongitude;
    }

    @Override
    public String toString() {
        return "EverythingByAuthor{" + "bookTitle=" + bookTitle + ", cityName=" + cityName + ", cityLatitude=" + cityLatitude + ", cityLongitude=" + cityLongitude + '}';
    }

}
