package evpurchaseprogram;

import java.util.ArrayList;

public class Dealership {

    //Variables
    private String name;
    private String country;
    private String address;
    private ArrayList<DealershipCar> dealershipCars = new ArrayList<DealershipCar>();

    /**
     *
     * @param name
     */
    //Constructor
    public Dealership(String name) {
        this.name = name;
    }

    // The public getters and setters for private instance variables
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {return country;}
    public void setCountry (String country) {this.country=country;}

    public String getAddress(){return address;}
    public void setAddress(String address) {this.address=address;}

    //Methods
    public void addCarToDealership(){}
    public void analyzeClientRequest(){}
    public void filterCarsByModel (){}
    public void sortCars(){}
    public void sellCarsUsingGbProgram(){}




}