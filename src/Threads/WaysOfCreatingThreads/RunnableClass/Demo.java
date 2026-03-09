package Threads.WaysOfCreatingThreads.RunnableClass;

class MyTask1 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread1 is Running...." + i);
        }
    }
}

class MyTask2 implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyTask1 obj = new MyTask1(); // Task only
        MyTask2 obj2 = new MyTask2();
        Thread t1 = new Thread(obj); // Thread 1
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        for(int i=0; i<10; i++){
            System.out.println("Main is running..." + i);
        }
    }
}
