//********************************************************************
//  Commission.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Represents a commission paid employee.
//********************************************************************
import java.util.ArrayList;
public class ThirstyEmployee extends Employee {
    
    protected static ArrayList thirsty = new ArrayList();
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this thirsty employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public ThirstyEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded
    }
    
    //-----------------------------------------------------------------
    //  Returns the amount of cash in the party fund.
    //-----------------------------------------------------------------
    public static void addToParty(Employee emp){
        thirsty.add(emp);
    }
}
