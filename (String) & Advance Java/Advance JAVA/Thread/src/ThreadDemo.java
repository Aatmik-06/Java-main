//Sequential flow of execution is called thread
//Every program consists a main thread
//java.lang package has thread class


//child class is used for making our program multitasking

//making Child Thread

//Thread Class       is used to make child thread
//runnable interface is used to make child thread in today's world it is mostly used


class MyThread extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("Thread Child");
        print();
    }

    public void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
//            sleep is used to stop and rerun program in given time interval
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException ex){
                System.out.println("exception = " + ex);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Thread = "+th.getName());
        
        MyThread mt = new MyThread();
        mt.start();
//        So run method will 
    }
}


