/*
 A Java Program to demonstrate linkedList list data structures
 Author : Wembo otepa Mulumba
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>() ;
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

        System.out.println("Hello World!");
    }
    private static void doTimings(String type, List<Integer> list){
        for (int i =0 ; i <1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        // Add items at end of list
        for(int i=0; i <1E5; i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken: " + (end -start) + " ms for" + type);
    }
}
