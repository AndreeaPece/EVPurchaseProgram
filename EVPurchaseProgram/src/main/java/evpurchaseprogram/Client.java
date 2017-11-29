package evpurchaseprogram;

public class Client {
    //Variables
    private int id;
    private String name;
    private String address;
    private String marketSegment;
    private String industry;
    private double income;
    private String telephone;
    private String email;


    //Constructor

    /**
     *
     * @param name
     */
    public Client (String name){
        this.name=name;
    }

    //The private getters and setters for public instance variables
    public int getId(){ return id;}
    public void setId(int id){this.id = id;}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getMarketSegment(){
        return marketSegment;
    }
    public void setMarketSegment(String marketSegment){
        this.marketSegment = marketSegment;
    }

    public String getIndustry(){
        return industry;
    }
    public void setIndustry(String industry){
        this.industry = industry;
    }

    public double getIncome(){
        return income;
    }
    public void setIncome(double income){
        this.income = income;
    }

    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}

