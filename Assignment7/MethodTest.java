import java.util.Arrays;
import java.util.List;

public class MethodTest {

    public static void count(List<?> list){
        System.out.println(list.size());
    }


    public static void main(String[] args) {
        String[] stringArray= {"Apple", "Banana", "Carrot", "Dragon Fruit", "Eggfruit", "Fig"};
        count(Arrays.asList(stringArray));

        Integer[] intArray ={1, 5, 7 ,9 ,11};
        count(Arrays.asList(intArray));

        Double[] doubleArray ={1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};
        count(Arrays.asList(doubleArray));

    }
}


