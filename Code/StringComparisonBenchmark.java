public class StringComparisonBenchmark {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "HelloWorld";
        
        int iterations = 1000000;
        long startTime, endTime;

        // Test 1: Using == operator
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            if (str1 == str2) { /* Do nothing */ }
        }
        endTime = System.nanoTime();
        System.out.println("== operator: " + (endTime - startTime) + " ns");

        // Test 2: Using equals() method
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            if (str1.equals(str2)) { /* Do nothing */ }
        }
        endTime = System.nanoTime();
        System.out.println("equals() method: " + (endTime - startTime) + " ns");

        // Test 3: Using compareTo() method
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            if (str1.compareTo(str2) == 0) { /* Do nothing */ }
        }
        endTime = System.nanoTime();
        System.out.println("compareTo() method: " + (endTime - startTime) + " ns");

        // Test 4: Using equalsIgnoreCase() method
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            if (str1.equalsIgnoreCase(str2)) { /* Do nothing */ }
        }
        endTime = System.nanoTime();
        System.out.println("equalsIgnoreCase() method: " + (endTime - startTime) + " ns");
    }
}
