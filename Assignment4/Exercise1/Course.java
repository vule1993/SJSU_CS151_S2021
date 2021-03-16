public class Course implements Cloneable {
    private String courseName;
    private String courseDescription;
    private String courseDepartment;
    private String courseTime;
    private String courseDay;

    public Course(String courseName, String courseDescription, String courseDepartment, String courseTime, String courseDay) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDepartment = courseDepartment;
        this.courseTime = courseTime;
        this.courseDay = courseDay;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString(){
        return "course name: " + courseName + ", course description: " + courseDescription + ", course department: " + courseDepartment + ", course start time: " + courseTime + ", course day: " + courseDay;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseDay() {
        return courseDay;
    }

    public void setCourseDay(String courseDay) {
        this.courseDay = courseDay;
    }
}
