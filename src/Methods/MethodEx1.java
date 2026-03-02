package Methods;

public class MethodEx1 {
    void greet(){ // method signature
        System.out.println("good Morning");
        System.out.println("have a nice day!");
    }
    public static void main(String[] args) {
        MethodEx1 obj = new MethodEx1();
        obj.greet();
    }
}
