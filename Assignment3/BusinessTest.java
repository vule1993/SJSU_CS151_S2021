public class BusinessTest {
    public static void main(String[] args) {
        //Test fullTimeSalariedEmployee
        System.out.println("Test for Full Time Salaried Employee: ");
        Address employeeSalaried1Address= new Address(120, "Lamerheaven ct", "San Jose", "95111", "CA");
        FullTimeSalaried employeeSalaried1 = new FullTimeSalaried("Tommy", "Le", employeeSalaried1Address, 123456, 90000);
        employeeSalaried1.setSsn("744776152");
        employeeSalaried1.setAge(25);
        employeeSalaried1.introduce(true);
        System.out.println("Employee Salary for this year is: " + employeeSalaried1.computePay(12));
        System.out.println("                                 *****************            ");

        Address employeeSalaried2Address = new Address(3089, "Angeloni Pl", "San Jose", "95111", "CA");
        FullTimeSalaried employeeSalaried2 = new FullTimeSalaried("Cindy", "Nguyen", employeeSalaried2Address, 123455, 120000);
        employeeSalaried2.setSsn("788766554");
        employeeSalaried2.setAge(30);
        employeeSalaried2.introduce(false);
        System.out.println("Employee Salary for this year is: " + employeeSalaried2.computePay(32));
        System.out.println("----------------------------------------------------------------------------------------------------------");

        //Test Executive
        System.out.println("Test for Exective: ");
        Address executive1Address = new Address(1123, "McLaughlin Avenue", "San Jose", "95122", "CA");
        Executive executive1 = new Executive("Brian", "Trump", executive1Address, 55443, 80000, 150000);

        executive1.setSsn("71776132");
        executive1.setAge(47);
        executive1.introduce(true);
        System.out.println("Employee Salary for this year is: " + executive1.computePay());
        System.out.println("                                 *****************            ");

        Address executive2Address = new Address(2203, "University Ave", "Mountain View", "95040", "CA");
        Executive executive2 = new Executive("Sunny", "Vuitton", executive2Address, 223456, 120000, 230000);
        executive2.setSsn("897654587");
        executive2.setAge(55);
        executive2.introduce(false);
        System.out.println("Employee Salary for this year is: " + executive2.computePay());
        System.out.println("----------------------------------------------------------------------------------------------------------");

        //Test for Full Time Employee Hourly:

        System.out.println("Test for Full Time Hourly: ");
        Address fullTimeHourly1Address = new Address(2179, "Wall St", "San Jose", "95133", "CA");
        FullTimeHourly fullTimeHourlyEmployee1 = new FullTimeHourly("Kevin", "Clinton", fullTimeHourly1Address, 443211,70, 120);

        fullTimeHourlyEmployee1.setSsn("765152422");
        fullTimeHourlyEmployee1.setAge(31);
        fullTimeHourlyEmployee1.introduce(false);
        System.out.println("Employee Salary for this week is: " + fullTimeHourlyEmployee1.computePay(45));
        System.out.println("                                 *****************            ");

        Address fullTimeHourly2Address = new Address(887, "Sue Ave", "Mountain View", "95040", "CA");
        FullTimeHourly fullTimeHourlyEmployee2 = new FullTimeHourly("Sunny", "Vuitton", fullTimeHourly2Address, 123455, 70, 120);
        fullTimeHourlyEmployee2.setSsn("976554333");
        fullTimeHourlyEmployee2.setAge(42);
        fullTimeHourlyEmployee2.introduce(true);
        System.out.println("Employee Salary for this week is: " + fullTimeHourlyEmployee2.computePay(50));
        System.out.println("----------------------------------------------------------------------------------------------------------");

        //Test for Part Time Employee Hourly:

        System.out.println("Test for Part Time Hourly: ");
        Address partTimeHourlyEmployee1Address = new Address(223, "Central St", "Cupertino", "95041", "CA");
        PartTimeHourly partTimeHourlyEmployee1 = new PartTimeHourly("Susan", "Edwin", partTimeHourlyEmployee1Address, 116621,70);

        partTimeHourlyEmployee1.setSsn("009122233");
        partTimeHourlyEmployee1.setAge(22);
        partTimeHourlyEmployee1.introduce(true);
        System.out.println("Employee Salary for this week is: " + partTimeHourlyEmployee1.computePay(30));
        System.out.println("                                 *****************            ");

        Address partTimeHourlyEmployee2Address = new Address(887, "Sue Ave", "Mountain View", "95040", "CA");
        PartTimeHourly partTimeHourlyEmployee2 = new PartTimeHourly("Luis", "Nguyen", partTimeHourlyEmployee2Address, 123455, 70);
        partTimeHourlyEmployee2.setSsn("223948475");
        partTimeHourlyEmployee2.setAge(33);
        partTimeHourlyEmployee2.introduce(false);
        System.out.println("Employee Salary for this week is: " + partTimeHourlyEmployee2.computePay(45));
        System.out.println("----------------------------------------------------------------------------------------------------------");


        //Test for Hourly Contractors:

        System.out.println("Test for Hourly Contractors: ");
        Address contractor1Address = new Address(10200, "Cherry Blossom Ave", "San Jose", "95133", "CA");
        Contractor contractor1 = new Contractor("Lilly", "Obama", contractor1Address, 11234,50);

        contractor1.setSsn("827645456");
        contractor1.setAge(32);
        contractor1.introduce(true);
        System.out.println("Employee Salary for this week is: " + contractor1.computePay(36));
        System.out.println("                                 *****************            ");

        Address contractor2Address = new Address(998, "Floyd Ct", "San Jose", "95110", "CA");
        Contractor contractor2 = new Contractor("Nhan", "Tran", contractor2Address, 998474, 50);
        contractor2.setSsn("223948475");
        contractor2.setAge(50);
        contractor2.introduce(false);
        System.out.println("Employee Salary for this week is: " + contractor2.computePay(45));
        System.out.println("----------------------------------------------------------------------------------------------------------");

        //Test for Customer:
        System.out.println("Test for Customers: ");
        Address customer1Address = new Address(787, "Sinbad Ave", "San Jose", "95116", "CA");
        Customer customer1 = new Customer("Lucy", "Bui", customer1Address, 90998);
        customer1.introduce();
        customer1.makePayment("Cash");

        System.out.println("                                 *****************            ");
        Address customer2Address = new Address(222, "Cherry Ave", "San Jose", "95125", "CA");
        Customer customer2 = new Customer("Lupe", "Sanchez", customer2Address, 90998);
        customer2.introduce();
        customer2.makePayment("Credit Card");
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}
