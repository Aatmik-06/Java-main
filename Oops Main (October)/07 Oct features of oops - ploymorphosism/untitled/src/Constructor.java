//Constructor

//constructor is also an special type of function which is called when object class is made
//constructor is called automatically when object is made
//constructor name and class name must match
//constructor do not have return type

// we have not maded a constructor and default constructor is working
// now we redefine constructor
public class Constructor {
    int id;
    String msg;
//    making our constructor
    public Constructor(){
        id =111;
        msg ="Hello Constructor";
    }

    public void print(){
        System.out.println("id = " + id);
        System.out.println("msg = " + msg);
    }
    public static void main(String[] args) {

        Constructor obj = new Constructor();
        obj.print();

    }
}
