package Threads.WaysOfCreatingThreads.ThreadClass;

class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread1 Is Running..." + i);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread is Running.." + i);
        }
    }
}
