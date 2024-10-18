import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        int FirstNumber = scanner.nextInt();

        System.out.println("Enter First Second");
        int SecondNumber = scanner.nextInt();

        System.out.println("Enter First Third");
        int ThirdNumber = scanner.nextInt();

        if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber) {
            System.out.println("First Number is greater");
        }else if (SecondNumber >FirstNumber && SecondNumber> ThirdNumber ){
            System.out.println("Second Number is greater");
        } else if (ThirdNumber > FirstNumber && ThirdNumber >SecondNumber) {
            System.out.println("Third Number is Greater");
        }
    }
}
