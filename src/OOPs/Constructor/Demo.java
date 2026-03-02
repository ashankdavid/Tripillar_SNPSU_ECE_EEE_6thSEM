package OOPs.Constructor;

public class Demo {
    Demo(){ // default constructor! or non parameterized
        System.out.println("I'm a constructor!");
    }

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo onj2 = new Demo();
        Demo onj3 = new Demo();
        Demo onj4 = new Demo();
        Demo onj5= new Demo();
    }
}
