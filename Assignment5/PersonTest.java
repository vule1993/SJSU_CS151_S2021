import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {


    public static void main(String[] args) {
        ArrayList<Person> employeeList = new ArrayList<Person>();
        Comparator<Person> ageCompare = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Comparator<Person> firstNameCompare = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().length() - o2.getFirstName().length();
            }
        };
        Comparator<Person> lastNameCompare = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().length() - o2.getLastName().length();
            }
        };

        employeeList.add(new Person("Joe", "Smith", 40));
        employeeList.add(new Person("Amy", "Gold", 32));
        employeeList.add(new Person("Tony", "Stork", 21));
        employeeList.add(new Person("Sean", "Irish", 24));
        employeeList.add(new Person("Tina", "Brock", 28));
        employeeList.add(new Person("Lenny", "Hep", 18));

        System.out.println("Before Sorting: ");
        for(Person str: employeeList){
            System.out.println(str);
        }

        System.out.println("Age Sorting by Ascending: ");
        Collections.sort(employeeList,ageCompare);
        for(Person str: employeeList){
            System.out.println(str);
        }

        System.out.println("Age Sorting by Descending: ");
        Collections.sort(employeeList,ageCompare.reversed());
        for(Person str: employeeList){
            System.out.println(str);
        }

        System.out.println("First Name Sorting by Ascending: ");
        Collections.sort(employeeList,firstNameCompare);
        for(Person str: employeeList){
            System.out.println(str);
        }

        System.out.println("First Name Sorting by length Descending: ");
        Collections.sort(employeeList,firstNameCompare.reversed());
        for(Person str: employeeList){
            System.out.println(str);
        }


        System.out.println("Last Name Sorting by Ascending: ");
        Collections.sort(employeeList,lastNameCompare);
        for(Person str: employeeList){
            System.out.println(str);
        }

        System.out.println("Last Name Sorting by length Descending: ");
        Collections.sort(employeeList,lastNameCompare.reversed());
        for(Person str: employeeList){
            System.out.println(str);
        }
    }
}
