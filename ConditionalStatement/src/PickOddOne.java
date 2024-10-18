import java.util.Scanner;
//**Pick the odd one out** - Write a program to accept four numbers from user and print the odd one among them.
//        - Number can be odd among others in following scenario:
//        - if three numbers are equal, then the different one is odd one among them.
//        - if three number are even, then the different one is odd one among them.
//        - if three number are odd, then the different one is odd one among them.
//        - if all are different, even or odd, then print no number is odd one among them.

public class PickOddOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter any number : ");
        int number2 = scanner.nextInt();

        System.out.print("Enter any number : ");
        int number3 = scanner.nextInt();

        System.out.print("Enter any number : ");
        int number4 = scanner.nextInt();

        if (number1 == number2 || number2 == number3 || number3 == number4) {}

    }
}
