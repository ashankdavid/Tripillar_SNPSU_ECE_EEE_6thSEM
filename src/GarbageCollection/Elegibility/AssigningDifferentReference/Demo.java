package GarbageCollection.Elegibility.AssigningDifferentReference;

public class Demo {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = obj2;

        // now the object 1 in the heap will be eligible for GC
    }
}
