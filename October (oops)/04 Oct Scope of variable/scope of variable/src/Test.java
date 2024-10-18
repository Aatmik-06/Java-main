//        Local Scope
public class Test{
    static int ctr = 2;
    public void incr(){
        ctr++;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.incr();
    }
}

class impl{
    void incr1(){
        Test.ctr++;
        System.out.println(Test.ctr);

    }
}


