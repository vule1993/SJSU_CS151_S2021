public class FullTimeHourly extends FullTimeEmployee {
    private double overtimePay;

    @Override
    public String toString() {
        return super.toString();
    }
    public void introduce(boolean displaySSN){
        if (displaySSN == true){
            System.out.println("SSN is " +getSsn());
            System.out.println(toString());
        } else {
            System.out.println("SSN is hiding");
            System.out.println(toString());
        }

    }
    public double computePay(int numHrs){
    if (numHrs > 40) {
        int numHrsOvertime = numHrs - 40;
        return ((40*getBasePay()) + (numHrsOvertime*overtimePay));
    } else {
        return (numHrs*getBasePay());
    }
    }

    public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtimePay) {
        super(firstName, lastName, address, id, basePay);
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
}
