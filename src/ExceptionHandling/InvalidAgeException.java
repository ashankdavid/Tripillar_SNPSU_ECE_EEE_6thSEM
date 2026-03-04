package ExceptionHandling;

// custom runtimeException
public class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg){ // constructor
        super(msg);
    }
}

class Driver{
    static void checkAge(int age){
        if(age<18){
            throw new InvalidAgeException("Age must be over 18");
            // throwing a new custom runtime exception
        }
        System.out.println("You are Eligible");
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
