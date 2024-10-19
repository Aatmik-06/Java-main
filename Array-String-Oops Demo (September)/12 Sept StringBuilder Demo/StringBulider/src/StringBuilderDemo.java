import java.lang.StringBuilder;
import java.util.Scanner;
//        string builder is a class that provides mutable implementations of String
//        that means you can change sequence of the character that are available in the string
//        string builder implementation and character array
//        This means there will be some initial capacity of a string builder object(16)

//        Constructor to build string builder
//        String Builder is a class
//        It accepts string
//        we do not have to import String builder it is stored in java.lang
public class StringBuilderDemo{
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Aatmik");
        Scanner scanner = new Scanner(System.in);

        int length = stringBuilder.length();
        System.out.println("length = " + length);
//      This method will return the total number of characters present in the stringBuilder object not the capacity

        int capacity = stringBuilder.capacity();
        System.out.println("capacity = " + capacity);
//      This method will return the current capacity of the stringBuilder object

        stringBuilder.append(" kushwaha");
        System.out.println("stringBuilder = " + stringBuilder);
//      Append method will add or append or concatenate the given string to the existing stringBuilder
//        Examples - stringBuilder.append("Kushwaha")
//        By default StringBuilder have a capacity of 16 characters

        stringBuilder.replace(0,11,"Aadi");
        System.out.println("Replaced stringBuilder = " + stringBuilder);
//        Replace will replace thr current string with given value and we have to give start and end index also


//        Whenever the capacity of stringBuilder reaches its maximum value it will increase by (Capacity + 1) * 2
//      We can see below the capacity
        for (int i = 65; i < 122; i++) {
            stringBuilder.append((char)i);
            System.out.println("capacity = " + stringBuilder.capacity());
            System.out.println("enter any string");
            scanner.nextLine();
        }


        char [] a = {65,66,67,68,69,70};
        char [] b = {97,98,99,100,101};

        char [] crr = new char[48];
        for (int i = 0; i < a.length; i++) {
            crr[i] = a[i];
        }
        a= crr;
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);

    }
}