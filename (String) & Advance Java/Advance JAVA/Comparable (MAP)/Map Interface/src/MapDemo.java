//there are two types of map
//Tree Map
//Hash Map
// Default size of map is 10
// it creates buckets means when 10 size is full so size will get increased by 1.5x to 1.6x



import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

//        Sorting has been done on the basis of key
        Map m = new TreeMap();
//     m.put(key,value)first is Objectkey and second is Objectvalue of it
        m.put(2,4000);
        m.put(4,850);
        m.put(5,"hello");
        m.put(3,457);
        m.put(1,"Good");
//        key doesnot be duplicate
        System.out.println("m = " + m);

//      if we have to access key so
        System.out.println("Printing all the keys ");
        Set set = m.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            System.out.println("i = " + i.next());
        }
        
//        if we have to access values so 
        System.out.println("Printing all the values ");
        Collection c= m.values();
        Iterator i2 = c.iterator();
        while (i2.hasNext()){
            System.out.println("i2 = " + i2.next());
        }

//        if we have to access both keys and values
        System.out.println("Printing both key and values ");
        Set s3 = m.entrySet();
        Iterator i3 = s3.iterator();
        while (i3.hasNext()){
            System.out.println( i3.next());
        }

        System.out.println("Size = "+m.size());

       if (m.containsKey(2)){
           System.out.println("Key Found "  );
       }

        m.remove(3);
        System.out.println("After removing the data :");
        System.out.println("m = " + m);

        if (m.containsValue("hello")){
            System.out.println("Value Found");
        }
        else {
            System.out.println("Value Not found");
        }

        m.clear();
        System.out.println("Data cleared  = " + m);

//        putting data after clear
        m.put(5,"Ji");
        System.out.println("m = " + m);

    }
}
