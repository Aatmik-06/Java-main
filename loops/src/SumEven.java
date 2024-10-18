import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number ;
        int sum = 0;
        do {
            System.out.print("Enter any number and press 0 to stop ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }while (number != 0);
        System.out.println("sum = " + sum);
    }
}
