//List Interface Types
//Types
//Array List
//Linked List
//Stack List
//Vector List not used in todays world

//Array List uses Object
//Object is Dynamic
//We can store any type of data in Array List

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {

//        Using Array List

//        List is an interface
//        Array List is Class of Array List interface used as reference for interface
        List l = new ArrayList();
        System.out.println(l.size());
        l.add(10);
        l.add(20);
        l.add("Aadi");
        l.add(30.548);
        System.out.println("l = " + l);
    }
}
