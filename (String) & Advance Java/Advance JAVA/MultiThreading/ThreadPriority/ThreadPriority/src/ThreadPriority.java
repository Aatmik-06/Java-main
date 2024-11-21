
//Thread Priority is used to not get race condition
class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello User");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        int value = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("value = " + value);
        Thread1 th1 = new Thread1();
        Thread t = new Thread(th1);
//        setting in child
//        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        int value1 = t.getPriority();
        System.out.println("value1 = " + value1);
        System.out.println("value = " + value);

    }
}
