import java.util.Scanner;

public class PrintOneToTwenty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 1 ;
        do {
            System.out.println(number);
            number ++;
        }while (number<=20);

    }
}
