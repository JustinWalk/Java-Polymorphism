//********************************************************************
//  Volunteer.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Represents a staff member that works as a volunteer.
//********************************************************************

public class Volunteer extends StaffMember {
    //-----------------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified
    //  information.
    //-----------------------------------------------------------------

    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    public double pay() {
        return 0.0;
    }
}
