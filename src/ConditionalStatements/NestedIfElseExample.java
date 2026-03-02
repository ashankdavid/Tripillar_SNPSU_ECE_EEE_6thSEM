package ConditionalStatements;

public class NestedIfElseExample {
    public static void main(String[] args) {
        int a = 2;
        if(a>5){
            if(a<15){
                System.out.println("SNPSU");
            }
            else{
                System.out.println("ECE");
            }
        }else{
            System.out.println("EEE");
        }
    }
}
