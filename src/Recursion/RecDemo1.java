package Recursion;

public class RecDemo1 {
    static void function(int x){
        if(x<5){//-----------------> Base Case
            System.out.println("Hello ");
            function(x+1); // ---> Recursive Case
        }
    }

    public static void main(String[] args) {
        function(0);
    }
}
