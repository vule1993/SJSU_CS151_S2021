public class Executive extends Employee{
    private double yearlyBonus;
    private double yearlyCompensation;


    public Executive(String firstName, String lastName, Address address, int id, double yearlyBonus, double yearlyCompensation) {
        super(firstName, lastName, address, id);
        this.yearlyBonus = yearlyBonus;
        this.yearlyCompensation = yearlyCompensation;
    }

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
    public double computePay(){
    return (yearlyBonus + yearlyCompensation);
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public double getYearlyCompensation() {
        return yearlyCompensation;
    }

    public void setYearlyCompensation(double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }
}
