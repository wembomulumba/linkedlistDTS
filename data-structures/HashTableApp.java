package DataStructures;


import java.util.Enumeration;
import java.util.Hashtable;
public class HashTableApp {
    public static void main(String args[])  {
        //creating Hashtable
        Hashtable ht = new Hashtable();
        // Putting objects into Hashtable();
        ht.put("David", 1000);
        ht.put("John", 500);
        ht.put("Emma", 5000);
        // Hashtables enumeration example
        Enumeration e = ht.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
       // How to tind size of hashtables of hashtable in Java
        System.out.println("size of hashtable in java: " + ht.size());
        // Does Hashtable contain specified object as key
        System.out.println("Does hashtable contains David as key : " + ht.containsKey("David"));
        // Does Hashtable contain specified object as value
        System.out.println("Does hashtable contains 500 as value : " + ht.containsValue(5000));
    }
}
