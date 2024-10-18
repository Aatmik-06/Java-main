import java.util.Scanner;

public class PrintEvenBtwOneToTwenty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number ++;
        }while (number <= 20);
    }
}
