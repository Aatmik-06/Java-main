public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int x= 100;
        int y=0;
        try {
            int r=x/y;
            System.out.println("r = " + r);
        }
        catch (ArithmeticException ex){
            System.out.println("exception = " + ex);
        }
        System.out.println("Process Over");
    }
}


