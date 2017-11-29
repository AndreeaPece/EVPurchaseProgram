package evpurchaseprogram;

public class Car {
    //Variables
    private String electricMotor;
    private String electricBattery;
    private String energyConsumption;
    private Manufacturer manufacturer;
    private String model;
    private int productionYear;
    private boolean fastCharging;
    private String rangerPerCharge;
    private String horsePower;

    //Constructor

    /**
     *
     * @param model
     * @param manufacturer
     */
    public Car(Manufacturer manufacturer, String model){
        this.manufacturer=manufacturer;
        this.model=model;
    }

    // The public getters and setters for private instance variables

    public String getElectricMotor(){ return electricMotor; }
    public void setElectricMotor(String electricMotor){ this.electricMotor = electricMotor; }

    public String getElectricBattery(){ return electricBattery; }
    public void setElectricBattery(String electricBattery){ this.electricBattery = electricBattery; }

    public String getEnergyConsumption(){ return energyConsumption; }
    public void setEnergyConsumption(String energyConsumption){ this.energyConsumption = energyConsumption; }

    public Manufacturer getManufacturer(){ return manufacturer; }
    public void setManufacturer(Manufacturer manufacturer){ this.manufacturer = manufacturer; }

    public String getModel(){ return model; }
    public void setModel(String model){ this.model = model; }

    public int getProductionYear(){ return productionYear; }
    public void setProductionYear(int productionYear){ this.productionYear = productionYear; }

    public boolean isFastCharging(){ return fastCharging; }
    public void setFastCharging(boolean fastCharging){ this.fastCharging = fastCharging; }

    public String getRangerPerCharge(){ return rangerPerCharge; }
    public void setRangerPerCharge(String rangerPerCharge){ this.rangerPerCharge = rangerPerCharge; }

    public String getHorsePower(){ return horsePower; }
    public void setHorsePower(String horsePower){ this.horsePower = horsePower; }

} //end of class Car
