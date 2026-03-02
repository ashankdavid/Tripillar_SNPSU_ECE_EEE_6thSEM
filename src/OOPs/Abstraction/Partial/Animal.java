package OOPs.Abstraction.Partial;

abstract class Animal {
    abstract void eat();

    void run(){
        System.out.println("Running...");
    }
}

class Lion extends Animal{
    void eat(){
        System.out.println("Meat");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Grass");
    }
}

class Driver{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
        l.run();

        Deer d = new Deer();
        d.eat();
        d.run();
    }
}
