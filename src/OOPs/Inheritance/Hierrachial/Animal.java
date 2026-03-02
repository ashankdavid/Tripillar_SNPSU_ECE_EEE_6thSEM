package OOPs.Inheritance.Hierrachial;

public class Animal {  // Parent
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{  // Child 1
    void bark(){
        System.out.println("Barking....");
    }
}


class Cat extends Animal{ // Child 2
    void meow(){
        System.out.println("Meowing...");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}