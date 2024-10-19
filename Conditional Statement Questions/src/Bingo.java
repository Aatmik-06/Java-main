import java.util.Scanner;
//Bob, Jane and John playing with numbered balls, they were throwing the balls up in the air.
// If all the balls in the air have the same numbers, they say “bingo”,
// if two balls have the same numbers they say “team”, otherwise they say “try again”.
// Write a program, accept three numbers from the user, and print the message “bingo” or team ”or“ try again according to condition.
//
//Input Format
//
//First three line of input contain integers number
//
//Constraints
//
//numbers > 0 number < 100000
//
//Output Format
//
//print the message "bingo" or "team" or "try again"
public class Bingo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Number:");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter any Number:");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter any Number:");
        int number3 = scanner.nextInt();

        if (number1 > 0 && number1 < 100000 && number2 > 0 && number2 < 100000 && number3 > 0 && number3 < 100000) {
            if (number1 == number2 && number2 == number3) {
                System.out.println("Bingo");
            } else if (number1 == number2 || number1 == number3 || number2 == number3) {
                System.out.println("Team");
            }
        }else {
            System.out.println("Try Again");
        }
    }
}


