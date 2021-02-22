public class Student {
    private String fName;
    private String lName;
    private int age;
    private float gpa;
    private String major;
    private String department;

    public Student(String fName, String lName, int age, float gpa, String major, String department) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    class Course {
        public void printSchedule(){
            System.out.println("CS151 Tue/Thur 6-7:15, Eng101 Mon/Wed 10-11:15, Hist100 Tue/Thur 1:30-2:45");
        }
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
