import java.util.Scanner;
//Write a program that print the current balance of the account, ask the user to enter the withdrawal amount.
//        - if withdrawal amount is less than current balance,
//        - deduct the withdrawal amount form the current balance, if current balance after deduction is less than 500 INR,
//        deduct penalty of 50 INR and print current balance and penalty.
//      - otherwise, print the current balance.
//        - If withdrawal amount is greater than current balance, print insufficient funds.
//        ```
//Sample run 1
//Current balance = 5000
//Enter withdrawal amount - 4600
//Current balance = 350
//Penalty = 50
//
//Sample run 2
//Current balance = 5000
//Enter withdrawal amount - 4500
//Current balance = 500
//
//Current balance = 5000
//Enter withdrawal amount - 5600
//insufficient funds

public class CurrentBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//   not completed
        double currentBalance = 5000;
        System.out.println("CurrentBalance = " + currentBalance);

        System.out.print("Enter Withdrawal Amount :");
        double withdrawalAmount = scanner.nextInt();

        if (withdrawalAmount > currentBalance){
            System.out.println("Insufficient Balance");
        }
        if(withdrawalAmount < currentBalance) {
           double newCurrentBalance = currentBalance - withdrawalAmount;
            System.out.println("currentBalance = " + newCurrentBalance);
            if (withdrawalAmount - newCurrentBalance <= 500) {
                double penalty = 50;
                System.out.println("Current Balance is less than 500 so you have to pay Penalty ");
                newCurrentBalance = newCurrentBalance - penalty;
                System.out.println("penalty = " + penalty);
                System.out.println("newCurrentBalance = " + newCurrentBalance);
            }
        }
    }
}
