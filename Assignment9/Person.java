public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address Address;



    public String toString() {
        return
                "Full name: " +getFirstName()+ " " + getLastName() +
                        "; age: " + getAge() +
                        "; ssn: " +getSsn()+ "; Address: " + getAddress() +".";
    }

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = address;
    }

    public Person() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        this.Address = address;
    }
}
