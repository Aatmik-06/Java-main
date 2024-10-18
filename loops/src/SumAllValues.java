import java.util.Scanner;

//Write a program to sum all the entered value until user enter 0 to stop.
public class SumAllValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number ;
        int sum = 0;
        do {
            System.out.print("Enter any number to sum and press 0 to stop : ");
            number = scanner.nextInt();
            sum = sum + number;
        }while (number != 0);
        System.out.println("Sum = "+sum );
    }
}

