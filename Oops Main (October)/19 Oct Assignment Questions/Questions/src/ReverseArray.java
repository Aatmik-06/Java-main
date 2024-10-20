import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int j = array.length; j >= 0; j++) {
            System.out.println(array[j]);
        }
    }
}

