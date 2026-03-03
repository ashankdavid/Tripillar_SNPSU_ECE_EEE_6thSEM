package OOPs.Abstraction.Complete100;

public interface Animal {
    void eat();
    void run();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Eating..");
    }

    public void run(){
        System.out.println("running..");
    }
}

class Driver{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
    }
}
