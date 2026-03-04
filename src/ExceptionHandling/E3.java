package ExceptionHandling;

public class E3 {
    static void checkAge(int age){
        if (age >= 18) {
            System.out.println("Access Granted!");
        }else{
            throw new RuntimeException("Access Denied!");
        }
    }
    public static void main(String[] args) {
//        checkAge(15);
        checkAge(20);
    }
}
