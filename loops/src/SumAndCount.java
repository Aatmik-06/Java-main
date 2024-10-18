import java.util.Scanner;
//Write a program to calculate sum of all the values entered
//also count the number of values entered by user, stop when user enter 0. Print the sum of the values and count.
public class SumAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number ;
        do {
        System.out.println("Enter any number and press 0 to stop");
            number = scanner.nextInt();
            sum = sum + number;
            count++;
        }while(number != 0);
        System.out.println("The sum = " + sum);
        System.out.println("The count = " + count);

    }
}
