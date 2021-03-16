public class StudentTest {
    public static void main(String[] args) {
        Course CS151 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00PM", "Tuesday");
        Student student1 = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science", CS151);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        student1.printInfo();
        student2.printInfo();

    }
}
