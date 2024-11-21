//This Program is Multi threaded
class MyThread implements Runnable{
    //    now we have to implement run method
    @Override
    public void run() {
        print();
    }
    public void print(){
        for (int i = 0; i <= 5 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex2) {
                System.out.println("exception = " + ex2);
            }
            System.out.println("i = " + i);
        }
    }
}
class MyThread2 implements Runnable{
    
    public void run() {
    disp();
    }
    public void disp(){
        for (int i = 0; i <=5; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex2) {
                System.out.println("exception = " + ex2);
            }
            System.out.println("I Love Java");
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread th = new MyThread();
//        we have to make one more Thread and pass mythread object into it below
        Thread t = new Thread(th);
        t.start();

        MyThread2 th2 = new MyThread2();
        Thread t2 = new Thread(th2);
        t2.start();

    }
}
//disadvantage of this is race condition
//means if we give same time to both treads so there will be a race in both the threads this is
