package Threads.Synchronization;

class Counter{
    static int count = 0;

    synchronized static void increment(){
        count++;
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<1000; i++){
            Counter.increment();
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){}

        System.out.println("Final Count: " + Counter.count);
    }
}
