public class Customer extends Person {
    private int customerID;
    private String payPreferences;


    public Customer(String firstName, String lastName, Address address, int customerID) {
        super(firstName, lastName, address);
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer Name: " + getFirstName() + " " + getLastName() +
                ", customer ID= " + getCustomerID() + ", Address: " + getAddress() +".";
    }

    public void introduce(){
        System.out.println(toString());    }
    public void makePayment(String payPreferences){
        System.out.println("Customer prefers to make payment by " + payPreferences);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPayPreferences() {
        return payPreferences;
    }

    public void setPayPreferences(String payPreferences) {
        this.payPreferences = payPreferences;
    }
}
