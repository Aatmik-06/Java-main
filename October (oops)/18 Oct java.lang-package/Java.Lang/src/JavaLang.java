
//Classes of Java.Lang Package are -

//Object
//String
//String Builder
//String Buffer
//Integer , Double


//Object
//Methods of object are-

//toString()
//hashCode()
//equals()
//
//

//Object - toString Method
class Student {
    private int sid;

//    toString method is used to change the behaviour
//    overriding toString method to print our message
    @Override
    public String toString() {
        return "Hello I am "+getClass().getName();
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}

public class JavaLang {
    public static void main(String[] args) {

        Student obj = new Student();
//        when we call object to by default toString is called
        System.out.println(obj);
//        same as this both are same
        System.out.println(obj.toString());
//        overriding toString method to print our message in student class

    }
}
