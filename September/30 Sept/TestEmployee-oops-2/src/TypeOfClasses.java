
//it is called inner class or nested class
//Here we have created outer class inside which we have created inner class
class Outer{
    String msg = "Hello I am Outer";
    class Inner{
        public void print(){
            System.out.println("msg = " + msg);
        }
    }
}
public class TypeOfClasses {
    public static void main(String[] args) {

//        we can create class using many methods 
//        1.Normal class 
//        2.inner Class
//        3.Abstract class
//        4.interphase class 
//        5.annonyonous class

//        Accessing outer class and accessing inner class
        Outer out = new Outer();
//        accessing inner class from outer class
        Outer.Inner in =  out.new Inner();
        in.print();
        
    }
}
