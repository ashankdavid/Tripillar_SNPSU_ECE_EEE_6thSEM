package GarbageCollection.Elegibility;

public class Demo {
    // This Finalize Function will only get called when System.gc() is called
    // But that too it depends on JVM when to collect garbage and when to leave
    // so we cant predict that how many times the garbage is collected
    public void finalize(){
        System.out.println("Garbage Collected!");
    }

    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Demo obj = new Demo();
            obj = null;
        }
        System.gc(); // Call Garbage Collector
    }
}
