public class Employee extends Person{
    private int id;
    private String status;
    private double basePay;
    private double payCheck;

    public Employee(String firstName, String lastName, int age, String ssn, String address, String gender,
                    double weight, int id, String status, double basePay) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }


     public double calculatePay(double unitsWorked){
        if (status.toLowerCase() == "fulltime") {
     payCheck = (basePay/52) * unitsWorked;
        }
        else {
     payCheck = unitsWorked*basePay;
        }
        return payCheck;
    }
    public void displayPayCheck(){
        System.out.println("Paycheck Amount: " + payCheck);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Employee ID: " + id + ", Employee Status: " + status + ", Base Pay: " +basePay +".");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }



}
