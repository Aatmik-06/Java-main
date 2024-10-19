class testFun {
//    here we are making class inside testClass function
    public void testClass() {

        class Hello {
            void print (){
                System.out.println("Hello");
            }
        }
        new Hello().print();   // here object is made as well as we are calling function
    }
}

public class ExampleFunction {
    public static void main(String[] args) {
        new testFun().testClass();
    }

}
