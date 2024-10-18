import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Write a program to accept three numbers from user and print all are divisible by 9, if all three numbers are divisible by 9.
        System.out.println("Enter any three numbers");
        System.out.println("Enter First number");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter Third number");
        int number3 = scanner.nextInt();

        if (number1 % 9 == 0 && number2 % 9 == 0 && number3 % 9 == 0) {
            System.out.println("All three numbers are Divisible by 9");
        }else {
            System.out.println("All Three numbers are not Divisible by 9");
        }
    }
}
