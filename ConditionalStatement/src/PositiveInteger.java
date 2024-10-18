import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
//        Write a program that accept an integer form user and print positive, if the integer is positive.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Positive Integer");
        }else {
            System.out.println("Negative Integer");
        }
    }
}
