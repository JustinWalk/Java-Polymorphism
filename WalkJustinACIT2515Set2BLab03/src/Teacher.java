//********************************************************************
//  Teacher.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Represents a teacher employee.
//********************************************************************
public class Teacher extends Employee {
    
    // "Stress" bonus
    public final double STRESS = 125;
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this teacher with the specified
    //  information.
    //-----------------------------------------------------------------
    public Teacher(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }
    
    //-----------------------------------------------------------------
    //  Computes and returns the pay for a teacher, which is the
    //  regular employee payment plus a "stress" bonus.
    //-----------------------------------------------------------------
    public double pay() {
        double payment = super.pay() + STRESS;

        return payment;
    }
    
}
