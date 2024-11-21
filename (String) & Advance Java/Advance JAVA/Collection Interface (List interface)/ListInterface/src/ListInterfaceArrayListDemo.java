import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//        iterator is used to print the data from list
//        there are 3 types to access data
//        iterator
//        list iterator
//        Enumraution
//
class listDemo{
    List l = new ArrayList();

    public void addData() {
        l.add(JOptionPane.showInputDialog("Enter String"));
        l.add(Integer.parseInt(JOptionPane.showInputDialog("Enter Integer")));
        l.add(true);
        l.add(452.5454);
        System.out.println("l = " + l);
    }
//    Iterator
//    public void getElement(){
//        Iterator i = l.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next()+"/t");
//        }
//    }

//List Iterator
    public void getElement(){
        ListIterator i = l.listIterator();

        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println();
        while (i.hasPrevious()){
            System.out.print(i.previous()+" ");
        }

    }
    public void addElement(Object data,int position ){
        l.add(position,data);
        System.out.println("added data = " + l);
    }
    public void removeData(Object data1 , int pos){
        l.remove(data1);
        System.out.println("removed data = " + l);
    }
    public void removealldata() {
        l.clear();
        System.out.println("remove all  = " + l);
    }
    public void search(Object data2){
        if(l.contains(data2)){
            System.out.println("data Found");
        }
    }
}
public class ListInterfaceArrayListDemo {
    public static void main(String[] args) {
        listDemo obj = new listDemo();
        obj.addData();
        System.out.println();
        obj.getElement();
        System.out.println();
        obj.addElement("bsdk",4);
        System.out.println();
        obj.removeData("bsdk",4);
        System.out.println();
        obj.search(300);
        System.out.println();
        obj.removealldata();

        }
}
