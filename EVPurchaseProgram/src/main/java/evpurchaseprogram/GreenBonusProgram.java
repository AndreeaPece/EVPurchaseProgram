package evpurchaseprogram;

import java.util.ArrayList;

public class GreenBonusProgram {
    //Variables
    private String decisionUnit;
    private static final double BUDGET=10000000;
    private double expenses;
    private ArrayList<Purchase> purchases = new ArrayList<Purchase>();

    // The public getters and setters for private instance variables
    public String getDecisionUnit() {
        return decisionUnit;
    }
    public void setDecisionUnit(String decisionUnit) {
        this.decisionUnit = decisionUnit;
    }

    //Methods
    public static boolean checkIfPurchaseEligible (){}
    public static boolean processDealershipRequest(){}
    public static void addExpenses(){}
    public static void offerBonus (){}
    public static void sendNotification(){}


}


