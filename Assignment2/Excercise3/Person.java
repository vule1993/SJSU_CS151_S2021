public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private double weight;

    public Person(String firstName, String lastName, int age, String ssn, String address, String gender, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }
   @Override
    public String toString() {
        return firstName + lastName + age + ssn + gender + weight;
    }
    public void introduce() {
        System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", SSN: " + ssn +
                ", Address: " + address + ", Gender: " + gender + ", Weight: " + weight + ".");

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
