//Finally is used
//Finally block will run always with exception and without exception
//finally block always written after try and catch block
public class FinallyExceptionHandler {
    public static void main(String[] args) {
        int []arr ={5,6,8,7,9};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);

            }
        }
        catch (ArrayIndexOutOfBoundsException ex1){
            System.out.println("exception = " + ex1);
        }
//        Finally block will run always with exception and without exception
        finally {
            System.out.println("process Over");
        }
    }
}

//Final is used for make readonly
//Finalise is used garbage collection
//Finally is used for exception handling
