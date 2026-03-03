package Strings.StringBufferAndBuilder;

public class StringBufferBuilderTest {
    public static void main(String[] args) {
        // String Buffer
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for(int i=0; i<10000000; i++){
            sbf.append(" World");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by SBF: " +
                (stopTime - startTime) + "ms");

        // String Builder
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("Hello");
        for(int i=0; i<10000000; i++){
            sbl.append(" World");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by SBL: " +
                (stopTime - startTime) + "ms");

    }
}
