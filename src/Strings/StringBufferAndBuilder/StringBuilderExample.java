package Strings.StringBufferAndBuilder;

public class StringBuilderExample {
    static void stringAppend(){
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println("Orginal String is: " + sbf);
        sbf.append(" World");
        System.out.println("New String is: " + sbf);
    }

    static void stringinsert(){
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println("Orginal String is: " + sbf);
        sbf.insert(2, "World");
        System.out.println("New String is: " + sbf);
    }

    static void stringReverse(){
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println("Orginal String is: " + sbf);
        sbf.reverse();
        System.out.println("New String is: " + sbf);
    }
    public static void main(String[] args) {
        stringAppend();
        stringinsert();
        stringReverse();
    }
}

