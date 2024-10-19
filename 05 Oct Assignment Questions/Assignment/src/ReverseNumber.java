import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = scanner.nextInt();
        int reverse = 0;
            while(number != 0) {
            int a = number % 10;
            reverse = reverse * 10 + a;
            number = number / 10;
        }
        System.out.print(reverse);

    }
}
