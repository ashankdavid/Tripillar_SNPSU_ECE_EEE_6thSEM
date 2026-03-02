package OOPs.Inheritance.Single;

public class Animal {  // parent class
    void eat(){
        System.out.println("Eating..");
    }
}

class Dog extends Animal{  // child class
    void bark(){
        System.out.println("Barking...");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

    }
}