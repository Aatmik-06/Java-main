import java.util.Arrays;
public class ArraySortDemo {
    public static void main(String[] args) {
        int []arr ={5,7,1,6,4,8,9,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
    }
}
