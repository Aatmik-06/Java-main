import java.util.Scanner;
//Write a program to check all the values entered by user,
//        if the entered value is even print, if the entered value is odd print odd, if the entered value is 0 stop.
public class OddEvenCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number ;
        do {
            System.out.print("Enter any number and press 0 to stop ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else if (number % 2 != 0) {
                System.out.println(number + " is odd");
            }
        }while (number != 0);
    }
}
