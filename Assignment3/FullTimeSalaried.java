public class FullTimeSalaried extends FullTimeEmployee{

    public FullTimeSalaried(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id, basePay);
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
    public double computePay(int numWeeks){
        return ((getBasePay()/52) *numWeeks);
    }

}
