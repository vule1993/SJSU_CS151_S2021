import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) {
     Address address1 = new Address(3019,"Angeloni Pl","San Jose", "95111", "CA");
     Person person1 = new Person("Danny", "Nguyen", address1);
     System.out.println("Person: " + person1.toString());

     Class personClass = person1.getClass();
     System.out.println("\n Person Class Declared methods: ");
     Method[] personDeclaredMethods = personClass.getDeclaredMethods();
     for(Method method: personDeclaredMethods) {
         String methodName = method.getName();
         Class[] parameters = method.getParameterTypes();
         if (parameters.length ==0){
             System.out.println(methodName + "() has 0 parameters");
         } else {
             System.out.println(methodName + "() has " + parameters.length + " parameter(s) of the following types:" );
         }
         for (Class p: parameters) {
             System.out.println("\t" + p.getName());
         }
     }


        Class addressClass = address1.getClass();

     System.out.println("\n Address Class methods: ");
     Method[] addressMethods = addressClass.getMethods();
        for(Method method: addressMethods) {
            String methodName = method.getName();
            Class[] parameters = method.getParameterTypes();
            if (parameters.length ==0){
                System.out.println(methodName + "() has 0 parameters");
            } else {
                System.out.println(methodName + "() has " + parameters.length + " parameter(s) of the following types:" );
            }
            for (Class p: parameters) {
                System.out.println("\t" + p.getName());
            }
        }

        System.out.println("\n Address Class Field name: ");
        Field[] addressClassDeclaredFields = Address.class.getDeclaredFields();
        for(Field field:addressClassDeclaredFields ) {
            System.out.println(field.getName());
        }
        System.out.println("\n Address Class Field names and types: ");
        for(Field field:addressClassDeclaredFields ) {
            System.out.println(field.toString());
        }

        try{
            Person person1Instance = Person.class.newInstance();
            person1Instance.setFirstName("Vu");
            person1Instance.setLastName("Le");
            person1Instance.setAge(28);
            person1Instance.setAddress(new Address(333, "Carvana Rd", "San Jose", "95112", "CA"));

            System.out.println("\n Person 1: " + person1Instance.toString());

            Person person2Instance = Person.class.newInstance();
            person2Instance.setFirstName("kevin");
            person2Instance.setLastName("Miguel");
            person2Instance.setAge(24);
            person2Instance.setAddress(new Address(221, "Zillow Rd", "San Jose", "95112", "CA"));

            System.out.println("\n Person 2: " + person2Instance.toString());

            Person person3Instance = Person.class.newInstance();
            person3Instance.setFirstName("kenny");
            person3Instance.setLastName("Garcia");
            person3Instance.setAge(24);
            person3Instance.setAddress(new Address(112, "Catfish Ct", "Los Angeles", "95145", "CA"));

            System.out.println("\n Person 3: " + person3Instance.toString());

        }catch ( IllegalAccessException | InstantiationException e) {
            System.out.println(e);
        }

    }
}
