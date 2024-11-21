//Runnable interface is mostly used
//Making thread through runnable interface
//This Program is single threaded
class MyThread implements Runnable{
//    now we have to implement run method
    @Override
    public void run() {
        print();

    }
    public void print(){
        for (int i = 0; i <= 5 ; i++) {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ex2) {
                System.out.println("exception = " + ex2);
            }
            System.out.println("i = " + i);
            }
        }
    }

public class RunnableInterface {
    public static void main(String[] args) {
        MyThread th = new MyThread();
//        we have to make one more Thread and pass mythread object into it below
        Thread t = new Thread(th);
        t.start();

    }
}
