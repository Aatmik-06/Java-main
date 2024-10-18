import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                    if (i== 0 || j==0 || i==4 || j==4 || j==i || i+j==4) {
//                        System.out.print(" *");
//                    }else {
//                        System.out.print("  ");
//                    }
//            }
//            System.out.println("");
//        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            int i, j;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }

