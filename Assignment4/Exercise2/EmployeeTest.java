public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", 101, 35);

        System.out.println("The employee earning is: " + employee.computePay(40));
        System.out.println("The employee earning is: "+  employee.computePay(23));
        System.out.println("The employee earning is: " +employee.computePay(1));
        System.out.println("The employee earning is: " +employee.computePay(0));
        System.out.println("The employee earning is: " +employee.computePay(-5));
        System.out.println("The employee earning is: " + employee.computePay(45));

    }
}
