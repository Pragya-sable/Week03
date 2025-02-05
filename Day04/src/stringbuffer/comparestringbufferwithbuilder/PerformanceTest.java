package stringbuffer.comparestringbufferwithbuilder;
// Program that compares the performance of StringBuffer
//  and StringBuilder for concatenating strings
public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;
        String input = "hello";

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(input);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("StringBuilder Time: " + stringBuilderTime + " ns");


        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbf.append(input);
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("StringBuffer Time: " + stringBufferTime + " ns");


        // Compare the results
        if (stringBufferTime < stringBuilderTime) {
            System.out.println("StringBuffer is faster");
        } else if (stringBufferTime > stringBuilderTime) {
            System.out.println("StringBuilder is faster");
        } else {
            System.out.println("Both StringBuffer and StringBuilder took the same time.");
        }
    }

}
