import java.util.Scanner;
//Write a program which accepts the starting point and end point from the user and print the sum and count of all the even values between the starting point and end point. Starting point and end point both are inclusive.
//Sample run
//enter the starting point - 10
//enter the end point - 20
//sum = 90
//count = 6
//
//
//Explaination:
//sum all the even values between 10 to 20, as starting point and end point both are inclusive
//10 + 12 + 14 + 16 + 18 + 20
//so the result is 90, and count is 6
public class StartingEndingPointEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingPoint ;
        int endingPoint ;
        int sum = 0;
        int count = 0;

        System.out.print("Enter starting point : ");
        startingPoint = scanner.nextInt();

        System.out.print("Enter ending point : ");
        endingPoint = scanner.nextInt();

        do {
            if (startingPoint % 2 == 0) {
                sum = sum + startingPoint;
                count++;
            }
            startingPoint++;

        }while (startingPoint <= endingPoint);
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }
}
