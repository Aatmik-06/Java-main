import java.util.Scanner;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int array[]  = {1,2,3,4,5,6,7,8,9,10};
//        int max = 0;
        int maximumElement = array[0];

        for (int i = 0; i < array.length; i++) {
            maximumElement = array[i];
            if (maximumElement<array[i]){
                System.out.println("maximumElement = " + maximumElement);
            }
        }

    }
}




