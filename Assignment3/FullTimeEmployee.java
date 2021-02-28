abstract class FullTimeEmployee extends Employee {
    private double BasePay;



    public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id);
        BasePay = basePay;
    }

    public double getBasePay() {
        return BasePay;
    }

    public void setBasePay(double basePay) {
        BasePay = basePay;
    }
}
