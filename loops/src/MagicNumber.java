import java.util.Scanner;
//Write a program which accept a magic number form the user, print winner and stop if user entered magic number.
//In this particular question magic number is the question number. :-)
public class MagicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int MagicNumber = 7;
        int UserInput ;
        do {
            System.out.print("Enter Magic number: ");
            UserInput = scanner.nextInt();
            if(MagicNumber== UserInput) {
                System.out.println("Winner");
            }else {
                System.out.println("Loser");
            }
        }while(MagicNumber != UserInput);
    }
}
