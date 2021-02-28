public class PartTimeHourly extends Employee{
    private double baseHourlyPay;
    public PartTimeHourly(String firstName, String lastName, Address address, int id, double baseHourlyPay) {
        super(firstName, lastName, address, id);
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void introduce(boolean displaySSN){
        if (displaySSN == true){
            System.out.println("SSN is " +getSsn());
            System.out.println( super.toString());
        } else {
            System.out.println("SSN is hiding");
            System.out.println( super.toString());
        }
    }
    public double computePay(int numHrs){
    if (numHrs <= 40){
        return (numHrs*baseHourlyPay);
    }
    return -1;
    }

    public double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    public void setBaseHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }
}
