public class Contractor extends Employee{
    private double basePay;



    public Contractor(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id);
        this.basePay = basePay;
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
    return (basePay*numHrs);
    }
    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
}
