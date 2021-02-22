public class StudentTest {
    public static void main(String [] args) {
        //Create new instances Student and call constructor
        Student Student = new Student("John","Smith", 20, 3.6f, "Computer Science", "School of Computer Science");

        //System Print out the value

        System.out.println("Student Full Name: " + Student.getfName() + " " + Student.getlName() + ", Age = " + Student.getAge() +
                ", GPA: " + Student.getGpa() + ", Major: " + Student.getMajor() + ", Department: " + Student.getDepartment() + ".");
        //Access the nested inner class
        Student.Course schedule = Student.new Course();
        schedule.printSchedule();
    }
}
