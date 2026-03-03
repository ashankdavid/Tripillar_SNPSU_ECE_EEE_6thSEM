package OOPs.Basics.ClassWithoutAttributes;

public class Demo { // class
    void printDemo(){ // method
        System.out.println("Demoo");
    }
    static void printHii(){ // class Function
        System.out.println("Hii");
    }
}

class DriverCode{
    public static void main(String[] args) {
        Demo obj = new Demo(); // object creation
        obj.printDemo();

        Demo.printHii();
    }
}