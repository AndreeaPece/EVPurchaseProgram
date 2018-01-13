package evpurchaseprogram;

public class Purchase {
    //Variables
    Client client ;
    DealershipCar dealershipCar ;
    Dealership dealership;

    //Constructor

    /**
     *
     * @param client
     * @param dealershipCar
     * @param dealership
     */
    public Purchase(Client client, DealershipCar dealershipCar, Dealership dealership ){
        this.dealershipCar=dealershipCar;
        this.client=client;
        this.dealership = dealership;
    }
}
