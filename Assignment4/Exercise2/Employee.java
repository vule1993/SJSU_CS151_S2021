public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private int hourlyPay;


    public float computePay(int hour){
        float employeeEarned = 0;

        try {
            if(hour < 0){
                throw new NumberFormatException("Invalid Hour");
            } else if (hour > 40) {
                throw new TooManyHoursWorkedException("Too many Hours Worked");
            } else {
                employeeEarned = hour * hourlyPay;
            }
        } catch(TooManyHoursWorkedException | NumberFormatException e){
            System.out.println(e);
        }
        return employeeEarned;
    }
    public Employee(String firstName, String lastName, int employeeID, int hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.hourlyPay = hourlyPay;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
