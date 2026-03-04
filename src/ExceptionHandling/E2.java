package ExceptionHandling;

public class E2 {
    public static void main(String[] args) {
        int i=10, j=2, k=0;
        try{
            k = i/j;
            System.out.println(k);
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[20]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
