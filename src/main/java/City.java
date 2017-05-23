/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoffer
 */
public class City {

public String Name; 
public GeoLocation Location;

    public City(String Name, GeoLocation Location) {
        this.Name = Name;
        this.Location = Location;
    }

    public City() {
    }

   

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public GeoLocation getLocation() {
        return Location;
    }

    public void setLocation(GeoLocation Location) {
        this.Location = Location;
    }
    
    
    
    
    
    
}
