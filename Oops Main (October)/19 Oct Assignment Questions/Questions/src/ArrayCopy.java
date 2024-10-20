public class ArrayCopy {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] array1= new int[10];

        for (int i = 0; i < array.length; i++) {

                array1[i]=array[i];
                System.out.println(array1[i]);

        }
    }
}
