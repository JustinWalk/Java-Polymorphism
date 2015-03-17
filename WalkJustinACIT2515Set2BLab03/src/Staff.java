//********************************************************************
//  Staff.java       Author: Lewis/Loftus
//  By: Justin Walk, ACIT 2515 Set 2B, A00928087, January 31, 2015
//  Represents the personnel staff of a particular business.
//********************************************************************

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[9];

        staffList[0] = new Executive("Sam", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);

        staffList[1] = new Employee("Carla", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly("Diane", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.",
                "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane",
                "555-7282");
        
        staffList[6] = new Commission("George", "104 Seventh Ave.",
                "555-5555", "724-74-6745", 6.25, .2);
        staffList[7] = new Commission("Fred", "679 Fifth Ave.",
                "555-0110", "111-22-3333", 9.75, .15);
        
        staffList[8] = new Teacher("Jim", "333 Main Street",
                "555-1111", "999-88-7777", 1234.56);

        ((Executive) staffList[0]).awardBonus(500.00);
        ((Employee) staffList[1]).awardBonus(75);
        ((Commission) staffList[7]).awardBonus(250);

        ((Hourly) staffList[3]).addHours(40);
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[7]).addHours(40);
        
        ((Commission) staffList[6]).addSales(400);
        ((Commission) staffList[7]).addSales(950);
        
        ThirstyEmployee.addToParty((Employee)staffList[2]);
        ((Commission) staffList[6]).addToParty();
        ((Commission) staffList[7]).addToParty();
        
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;
        double total = 0;

        for (int count = 0; count < staffList.length; count++) {
            
            String name = staffList[count].name;
            for (int index = (10 - staffList[count].name.length()); index > 0; index--){
                name = name.concat(" ");
            }
            
            amount = staffList[count].pay();  // polymorphic
            total += amount;
            
            System.out.println(name + ((amount == 0) ? "Thanks!" : amount));
            
        }

        System.out.println("-----------------------------------");
        System.out.println("TOTAL     " + total);
        System.out.println("");
        System.out.println("Payday party fund: " 
        + (20 * ThirstyEmployee.thirsty.size() + 20 * Commission.party.size()));
        
    }
}
