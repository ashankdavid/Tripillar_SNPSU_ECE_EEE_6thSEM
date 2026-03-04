package Threads.WaysOfCreatingThreads.RunnableClass;

class MyTask implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread is Running....");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyTask obj = new MyTask(); // Task only
        Thread t1 = new Thread(obj); // Thread 1
        t1.start();

        for(int i=0; i<10; i++){
            System.out.println("Main is running...");
        }
    }
}
