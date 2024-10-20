
public class Array_Sum {
    public static void main(String[] args) {
        int integer[]  = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < integer.length; i++) {
            sum =sum+integer[i];
        }
        System.out.println("sum = " + sum);
    }
}
