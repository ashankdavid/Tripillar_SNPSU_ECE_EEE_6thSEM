package OOPs.Basics.ClassWithoutAttributes;

public class Demo { // class
    void printDemo(){ // method
        System.out.println("Demoo");
    }
}

class DriverCode{
    public static void main(String[] args) {
        Demo obj = new Demo(); // object creation
        obj.printDemo();
    }
}