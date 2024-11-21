import java.lang.reflect.Array;
import java.util.Arrays;

//Collection framework is an utility
//Pre Defined functions is stored in collection framework
//1.Arrays CRUD operation is also present in collection
//2.Collections types
//1. List interface 2. Set interface 3. Map interface
//List interface
//classes used for List interface Linked List , Array List , Vector list
//Set interface
//classes used for Set interface Tree Set , Hash set , Hash Linked Set
//Map interface
//classes used for Map interface Hash Map , Tree Map
public class CollectionFrameWorkDemo {
    public static void main(String[] args) {

        int []arr = {5,4,7,6,1,5,7};
        System.out.println("Searched Data = "+Arrays.binarySearch(arr,6));
//        it will search and return index of that element
        Arrays.sort(arr);
//        Diplay sorted data
        for (int i:arr){
            System.out.println("i = " + i);
        }
        int []copy = Arrays.copyOf(arr,arr.length);
//        it will return a new array
        System.out.println("Copied Array :");
        for (int x:copy){
            System.out.println("x = " + x);
        }
        int []copyRange= Arrays.copyOfRange(arr,1,3);
        System.out.println("Copy Of Range Data:");
        for (int y:copyRange){
            System.out.println("y = " + y);
        }
        if (Arrays.equals(copy,arr)){
            System.out.println("Both Are Equal Arrays");
        }
//        it will give true or false
        System.out.println(Arrays.hashCode(arr));
//        it will return hashcode or address of memory on that array
    }
}
//there are some limitations of array
//we cannot extend the size of array
//datatype is fixed
//So we will use Collection Interface