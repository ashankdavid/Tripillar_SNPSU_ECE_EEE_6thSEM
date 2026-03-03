package OOPs.Abstraction.Partial.AbstractClassConstructor;
// It is possible for an abstract class also to have a constructor!
abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }

    static void method(){}

    abstract void run();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }

    void run(){

    }
}

class Driver{
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal.method();
    }
}