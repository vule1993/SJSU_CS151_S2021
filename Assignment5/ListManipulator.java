import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;


public class ListManipulator {
    public static ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        if (ascending == true) {
            Collections.sort(myLst);
        }
        return myLst;
    }

    public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
        Collections.sort(myLst);
        Collections.swap(myLst,0,myLst.size()-1 );
         return myLst;
    }

    public static void table(ArrayList<Integer> myLst){
        System.out.println("------Table------");
            HashMap<Integer, Integer> timeOccur = new HashMap<>();
            for(int i=0 ; i<myLst.size() ; i++) {
                if(!timeOccur.containsKey(myLst.get(i))) {
                    timeOccur.put(myLst.get(i), 1);
                } else {
                    timeOccur.put(myLst.get(i), timeOccur.get(myLst.get(i))+1);
                }
            }
               TreeMap<Integer, Integer> sortedMap = new TreeMap<>(timeOccur);
            for(Object key : sortedMap.keySet()) {
                System.out.println(key +"\t:\t"+ sortedMap.get(key));
            }
        }







    public static void main(String[] args) {
        ArrayList<Integer> myLst = new ArrayList<>();
        myLst.add(12);
        myLst.add(0);
        myLst.add(9);
        myLst.add(1);
        myLst.add(15);
        myLst.add(17);
        myLst.add(17);
        myLst.add(9);


        /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for(int counter: myLst){
            System.out.println(counter);
        }

        sort(myLst,true);

        System.out.println("After Sorting:");
        for(int counter: myLst){
            System.out.println(counter);
        }
        Collections.sort(myLst);

        System.out.println("Before Swapping:");
        for(int counter: myLst){
            System.out.println(counter);
        }


        swapLargestSmallest(myLst);


        System.out.println("After Swapping:");
        for(int counter: myLst){
            System.out.println(counter);
        }


        table(myLst);

    }
}


