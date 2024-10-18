import java.util.Scanner;
//Write a program which accept a magic number form the user, print winner and stop if user entered magic number
//otherwise print try again. Also stop when user enter 0. In this particular question magic number is the question number.
public class MagicNumber2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int MagicNumber = 8;
            int UserInput ;
            do {
                System.out.print("Enter Magic number: ");
                 UserInput = scanner.nextInt();
                if(MagicNumber== UserInput) {
                    System.out.println("Winner");
                } else if (MagicNumber != UserInput) {
                    System.out.println("Try Again and press 0 to stop");
                } else {
                    System.out.println("Loser");
                }
            }while(MagicNumber != UserInput && UserInput != 0);
        }
    }

