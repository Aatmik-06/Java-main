import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number :");
        int number = scanner.nextInt();

        if (number<0) {
            System.out.println("Invalid");
        }
        if (number % 2 == 0 && number >=0) {
            System.out.println("even");
        } else if (number % 2 != 0 && number>= 0) {
            System.out.println("odd");
        }
    }
}

