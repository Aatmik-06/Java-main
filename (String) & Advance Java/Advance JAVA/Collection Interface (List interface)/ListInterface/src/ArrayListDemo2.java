import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Object []arr ={1,5,4,6,7,8,9,8};
        List li = Arrays.asList(arr);
        System.out.println("li = " + li);
        List li2 = new ArrayList();
        li2.add(5);
        li2.add(4);
        li2.add(88);
        Object []arr2 = li2.toArray();
//        Array Data
        for (Object i : arr2){
            System.out.println("data in array = " + i);
        }
//        list data
        ListIterator lirr = li2.listIterator();
        while (lirr.hasNext()){
            System.out.println("data in list ="+lirr.next());
        }
        while (lirr.hasPrevious()){
            System.out.println("data in list using previous ="+lirr.previous());
        }
        li2.clear();
        if (li2.isEmpty()){
            System.out.println("Empty list ");
        }
//Array list and Vector will give same output
//        But Array List is not thread safe and Vector is thread safe 
    }
}
