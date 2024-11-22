import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//we don't have to use iterator in linked list this is the advantage of linked list
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
//        some new methods of linked list
//    data is stored in our given structure
//        if we have to display data in an ascending or any order so we have to use sets
        li.add("Hello");
        li.add("End");
        li.addLast("Start");
        li.addFirst("24556");
        System.out.println("First = "+li.getFirst());
        System.out.println("Last = "+ li.getLast());
        System.out.println("li = " + li);

        Iterator i = li.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
