import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    LinkedList<Course> courseList;

    public Student() {
        courseList = new LinkedList<Course>();
    }

    public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void removeCourse(Course course){
        courseList.remove(course);
    }

    public void sortCourse(String attribute, boolean sortAscending) {
        HashMap<String, Integer> dayMapping = new HashMap<String, Integer>();
        dayMapping.put("Sunday", 0);
        dayMapping.put("Monday", 1);
        dayMapping.put("Tuesday", 2);
        dayMapping.put("Wednesday", 3);
        dayMapping.put("Thursday", 4);
        dayMapping.put("Friday", 5);
        dayMapping.put("Saturday", 6);
        Comparator<Course> dayCompare = new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return (dayMapping.get(c1.getCourseDay()) - dayMapping.get(c2.getCourseDay()));                    }
        };
        Comparator<Course> nameCompare = new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getCourseName().compareTo(c2.getCourseName());
            }
        };
        Comparator<Course> timeCompare = new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getCourseTime().compareTo(c2.getCourseTime());
            }
        };
        Comparator<Course> departmentCompare = new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
            return c1.getCourseDepartment().compareTo(c2.getCourseDepartment());
            }
        };

        if (sortAscending == true) {
            if (attribute == "name") {
                Collections.sort(courseList,nameCompare);
            } else if (attribute == "time") {
                Collections.sort(courseList,timeCompare);
            }else if (attribute == "day") {
                Collections.sort(courseList,dayCompare);
            } else if ( attribute == "department"){
                Collections.sort(courseList,departmentCompare);
            }
        } else {
            Collections.reverse(courseList);
        }

        for(Course c : courseList) {
            System.out.println(c);
        }

    }

    public void printInfo(){
        System.out.println("Student full name: " + firstName + " " + lastName + ", age: " + age + ", gpa: " + gpa + ", major: " + major + ", department: " + department + ", course: " + courseList);
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

    public LinkedList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(LinkedList<Course> courseList) {
        this.courseList = courseList;
    }

}
