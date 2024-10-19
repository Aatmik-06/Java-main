import java.util.Scanner;

public class EqualNumbers {
public static void main(String[] args) {
//    Write a program that accept two numbers from the user and print equals if the numbers are equal.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter First Number");
    int number1 = scanner.nextInt();
    System.out.println("Enter Second Number");
    int number2 = scanner.nextInt();

    if (number1 == number2){
        System.out.println("Both Numbers are Equal");
    }else {
        System.out.println("Both Numbers are Not Equal");
    }
}
}
