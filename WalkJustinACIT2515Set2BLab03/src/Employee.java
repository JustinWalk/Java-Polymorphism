//********************************************************************
//  Employee.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember {

    protected String socialSecurityNumber;
    protected double payRate;
    protected double bonus;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    //-----------------------------------------------------------------
    //  Awards the specified bonus to this employee.
    //-----------------------------------------------------------------
    public void awardBonus(double empBonus) {
        bonus = empBonus;
    }

    //-----------------------------------------------------------------
    //  Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString() {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay() {
        double payment = payRate + bonus;
        bonus = 0;
        return payment;
    }
}
