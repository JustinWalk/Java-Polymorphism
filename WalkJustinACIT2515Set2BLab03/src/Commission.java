//********************************************************************
//  Commission.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Represents a commission paid employee.
//********************************************************************
import java.util.ArrayList;
public class Commission extends Hourly implements PartyAnimal{
    
    double commRate = 0;
    double totalSales = 0;
    protected static ArrayList party = new ArrayList();
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this commission with the specified
    //  information.
    //-----------------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        commRate = commission;
    }
    
    //-----------------------------------------------------------------
    //  Add sales to employees total sales.
    //-----------------------------------------------------------------
    public void addSales(double sales){
        totalSales += sales;
    } 
    
    //-----------------------------------------------------------------
    //  Calculate the pay for the employee, using the hourly rate
    //  plus another value base on sales/commission rate.
    //-----------------------------------------------------------------
    public double pay() {
        
        double pay = super.pay() + (totalSales * this.commRate);
        
        totalSales = 0;
        return pay;    
    }
    
    //-----------------------------------------------------------------
    //  Returns the amount of cash in the party fund.
    //-----------------------------------------------------------------
    public double partyFund(){
        double fund = 20 * 2;
        return fund;
    }
    
    //-----------------------------------------------------------------
    //  Adds an employee to party list.
    //-----------------------------------------------------------------
    public void addToParty(){
        party.add(this);
    }
    
    //-----------------------------------------------------------------
    //  Returns information about a commission employee as a string.
    //-----------------------------------------------------------------
    public String toString() {
        
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        
        return result;
    }
    
}
