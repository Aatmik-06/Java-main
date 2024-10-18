import java.util.Scanner;

public class MakeEvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      Write a program to accept an integer from user. If the number is even make it odd and print.
//      If the number is odd make it even and print.
        System.out.print("Enter an integer : ");
        int number = scanner.nextInt();
        if (number == 0 ) {
            System.out.println("Zero is not even nor odd ");
        }else if (number % 2 == 0) {
            System.out.println("Number is Even");
                   System.out.println("Odd Number = " +(number+1));
        } else {
            System.out.println("Number is odd ");
            System.out.println("Even Number = " +(number+1));
        }
    }
}
