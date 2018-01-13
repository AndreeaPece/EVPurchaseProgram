package evpurchaseprogram;

public class DealershipCar {
    //Variables
    private Car car;
    private boolean typology;
    private double price;
    private int stockNumber;

    /**
     *
     * @param car
     * @param typology
     * @param price
     * @param stockNumber
     */
    //Constructor
    public DealershipCar (Car car, boolean typology, double price, int stockNumber){
        this.car = car;
        this.typology=typology;
        this.price=price;
        this.stockNumber=stockNumber;
    }
    // The public getters and setters for private instance variables
    public Car getCar(){
        return this.car;
    }
    public void setCar (Car car) {this.car=car;}

    public boolean isTypology(){
        return typology;
    }
    public void setTypology(boolean typology){
        this.typology = typology;
    }

    public double getPrice () {return price;}
    public void setPrice (double price) {this.price=price;}

    public int getStockNumber () {return stockNumber;}
    public void setStockNumber (int stockNumber) {this.stockNumber=stockNumber;}
}
