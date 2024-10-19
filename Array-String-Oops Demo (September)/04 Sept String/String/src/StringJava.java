//    String is a most used library class in java
//    In java string is a reference type, any time you are creating a
//    string means you are creating a string object
//    Most common way to create a stirng
//    String str ="Hello";
//    String is a sequence of characters.String can contain one or more characters
//    Eg- String gender ="M";
//    String class provides different ways to create string.Some of the ways are
//    String class has 13 different constructor
//    Ways to create array are
//    1. using array
//    char [] name = {'A','a','d','i'};
//    String myName = new String(name);
//    2. using string only
//    String email1 = "adi120kush@gamil.com";
//    String officialEmail = new String(email1);
//    3.
//    third way is equivalent to second
//    String personalEmail = new String("adi180kush@gmail.com");
//
//    there are more 10 ways present in java documentation
//
//    Java provides two different storage areas to work with string
//    1.String Pool
//    When we create string using double quotes than that string will be stored in String Pool
//    String Pool is created in Stack and we cannot increase size of Stack
//    2.Heap Memory
//    When we create string using new operator than that string will stored in Heap Memory
//
// *** Strings are immutables means once created it cannot be changed
// ** Sequence of character that is representing the string cannot be changed
public class StringJava {
    public static void main(String[] args) {
        String name1 = "Aadi";
        String name2 = "Aadi";
//        == will compare refrences and it will not have same refrence when created from new operator
        if (name1 == name2){
            System.out.println("Same Same");
        }else {
            System.out.println("Not Same");
        }
//        it will give same same because reference is same here
//        String should never be checked using == operator

        String name3 = "Aatmik";
        String name4 = new String("Aatmik");
//        == will compare refrences and it will not have same refrence when created from new operator
        if (name3 == name4){
            System.out.println("Same Same");
        }else {
            System.out.println("Not Same");
        }
//        it will give not same because reference is different
//        As String as a class it contains multiple methods to work with string
//        int length() // this method number of character present in string
//        method calling
//        objectName.methodName(arguments)

       int length =  name1.length();
        System.out.println("No. of characters in given string = " + length);
    }
}
