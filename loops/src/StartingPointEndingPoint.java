import java.util.Scanner;
//Write a program which accepts the starting point and end point from the user and print the
// sum of all the values between the starting point and end point. Starting point is inclusive and end point is exclusive.
//        Sample run
//enter the starting point - 10
//enter the end point - 15
//sum = 60
//
//Explaination:
//sum all the values between 10 to 15, as starting point is inclusive
//10 + 11 + 12 + 13 + 14
//        15 is not considered for sum as loop must iterate < 15
//so the result is 60
//
//Hint:
//        - i should be initialized with stating point
//- i should be less than end point

public class StartingPointEndingPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingPoint ;
        int endingPoint ;
        int sum = 0;

        System.out.print("Enter start point : ");
        startingPoint = scanner.nextInt();

        System.out.print("Enter ending point : ");
        endingPoint = scanner.nextInt();

        do {
            sum = sum + startingPoint;
            startingPoint++;
        }while(startingPoint < endingPoint);

        System.out.println("sum = " + sum);

    }
}
