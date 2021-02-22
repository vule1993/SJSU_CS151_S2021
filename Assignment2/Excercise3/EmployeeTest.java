public class EmployeeTest {
    public static void main(String [] args){
        Employee a = new Employee("Joe", "Smith", 20, "740987899", "3020 Wall Street San Jose, CA 95111",
                "male", 150, 2201,"contractor",60);
        a.calculatePay(30);
        a.introduce();
        a.displayPayCheck();

        Employee b = new Employee("Lisa", "Gray", 30, "74033399", "322 Sue Ave, San Jose, CA 95111",
                "female", 120, 2202,"fulltime",110000);
        b.calculatePay(4);
        b.introduce();
        b.displayPayCheck();

        Employee c = new Employee("Timothy", "Briggs", 27, "768889767", "1788 Angeloni Pl, San Jose, CA 95121",
                "male", 180, 2203,"fulltime",80000);
        c.calculatePay(4);
        c.introduce();
        c.displayPayCheck();

        Employee d = new Employee("George", "Wallace", 22, "741898873", "3047 McLaughlin Ave, San Jose, CA 95121",
                "male", 170, 2204,"part time",20);
        d.calculatePay(25);
        d.introduce();
        d.displayPayCheck();

        Employee e = new Employee("Amy", "Student", 18, "733894893", "307 Story Road, San Jose, CA 95121",
                "male", 170, 2204,"contractor",45);
        e.calculatePay(45);
        e.introduce();
        e.displayPayCheck();

    }
}
