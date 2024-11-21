import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
//        Print Random Number
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(10));
        }
//       Random OTP Generator
        for (int i = 0; i < 4; i++) {
            sb.append(String.valueOf(r.nextInt(10)));
        }
        System.out.println("OTP Generator = " + sb);
    }
}
