//there are two types of sets
// Tree Sets
// Hash Sets

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class TreeSetDemo{
    Set s = new TreeSet();
    public void addRecord(Object obj){
        s.add(obj);
        System.out.println("s = " + s);
    }
    public void viewRecord(){
        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()+" ");
        }
    }
    public void searchRecords(int data){
        if (s.contains(data)){
            System.out.println(data+" =" +" Found");
        }
        else {
            System.out.println(data+"="+"Data Not Found");
        }
    }
    public void deleteRecords(int data ){
        s.remove(data);
    }
    public void removeAll(){
        s.clear();
        System.out.println("Data Removed  = " + s);
        if (s.isEmpty()){
            System.out.println("Object is Empty ");
        }
    }
}

public class SetInterfaceDemo {
    public static void main(String[] args) {
        TreeSetDemo t = new TreeSetDemo();
//        the data we have to add must be of same data Type
        t.addRecord(785);
//        t.addRecord("Aadi");
        t.addRecord(45454);
        t.addRecord(45);
// it doesn't allow duplicate value
        t.addRecord(45);
//        it will not add this data because it is duplicate
//        we cannot give index to add data
        t.viewRecord();
        t.searchRecords(45);

        t.deleteRecords(785);
        t.searchRecords(785);
        t.removeAll();
    }
}
