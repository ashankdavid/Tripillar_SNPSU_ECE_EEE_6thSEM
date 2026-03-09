package Threads.ContolOverThreadExecution;

class myThread extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Thread1 is Running " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){}

        for(int i=1; i<=10; i++){
            System.out.println("Main Thread is Running " + i);
            try{
                Thread.sleep(5000);
            }catch (Exception e){}
        }

    }
}
