package OOPs.Polymorphism.CompileTime;
// Compile Time Polymorphism - OverLoading

public class Addition {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

class Driver{
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}
