//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm {
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        Staff personnel = new Staff();

        personnel.payday();
    }
}
