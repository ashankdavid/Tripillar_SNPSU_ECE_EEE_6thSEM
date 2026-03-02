package OOPs.Inheritance.MultiLevel;

public class Animal {  // GrandParent class
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{  // Parent Class
    void bark(){
        System.out.println("Barking...");
    }
}

class Puppy extends Dog{  // Child Class
    void cry(){
        System.out.println("Crying...");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        Puppy p = new Puppy();
        p.cry();
        p.eat();
        p.bark();
    }
}
