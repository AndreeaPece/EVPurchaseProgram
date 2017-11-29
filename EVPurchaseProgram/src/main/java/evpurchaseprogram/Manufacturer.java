package evpurchaseprogram;

public class Manufacturer {
    //Variables
    private String name;
    private String country;
    private String address;

    /**
     *
     * @param name
     */
    //Constructor
    public Manufacturer (String name){
        this.name=name;
    }

    // The public getters and setters for private instance variables
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCountry () {return country;}
    public void setCountry (String country) {this.country=country;}

    public String getAddress (){return address;}
    public void setAddress(String address) {this.address=address;}
}
