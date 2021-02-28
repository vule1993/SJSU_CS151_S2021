abstract class Employee extends Person {
    private int id;
    private String educationLevel;
    private boolean directDeposit;

    public Employee(String firstName, String lastName, Address address, int id) {
        super(firstName, lastName, address);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean isDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }
}
