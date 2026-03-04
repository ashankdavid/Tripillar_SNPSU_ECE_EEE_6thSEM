package GarbageCollection.Elegibility.NullifyingReference;

public class Demo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null;
        // now that object in the heap will be eligible for GC
    }
}
