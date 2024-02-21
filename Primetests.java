import java.util.ArrayList;

public class Primetests {
    public static boolean primetest1(int n) {
        boolean isprime = true;
        if (n < 2) {
            System.out.print("Error");
        }
        if (n == 2) {
            isprime = true;
        }
        else if (n > 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
        }
        return isprime;
    }

    public static boolean primetest2(int n) {
        boolean isprime = true;
        if (n < 2) {
            System.out.print("Error");
        }
        if (n == 2) {
            isprime = true;
        }
        for (int i = 2; i <= Math.pow(n,0.5); i++) {
            if (n%i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static boolean primetest3(int n) {
        boolean isprime = true;
        if (n < 2) {
            System.out.print("Error");
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.pow(n,0.5); i++) {
            if (n%i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(1013);
        // Test 1
        System.out.println("Test 1");
        long startTime1 = System.nanoTime();
        System.out.println(primetest1(1013));
        long endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest1: " + (endTime1 - startTime1) + " nanoseconds");
        Runtime run = Runtime.getRuntime();
        System.out.println("Free memory after primetest1: " + run.freeMemory() + " bytes");

        // Test 2
        System.out.println("Test 2");
        startTime1 = System.nanoTime();
        System.out.println(primetest2(1013));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest2: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest2: " + run.freeMemory() + " bytes");

        // Test 3
        System.out.println("Test 3");
        startTime1 = System.nanoTime();
        System.out.println(primetest3(1013));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest3: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest3: " + run.freeMemory() + " bytes");

        System.out.println("----------------------------------------");
        System.out.println(1017);
        // Test 1
        System.out.println("Test 1");
        startTime1 = System.nanoTime();
        System.out.println(primetest1(1017));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest1: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest1: " + run.freeMemory() + " bytes");

        // Test 2
        System.out.println("Test 2");
        startTime1 = System.nanoTime();
        System.out.println(primetest2(1017));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest2: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest2: " + run.freeMemory() + " bytes");

        // Test 3
        System.out.println("Test 3");
        startTime1 = System.nanoTime();
        System.out.println(primetest3(1017));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest3: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest3: " + run.freeMemory() + " bytes");

        System.out.println("----------------------------------------");
        System.out.println(10037);
        // Test 1
        System.out.println("Test 1");
        startTime1 = System.nanoTime();
        System.out.println(primetest1(10037));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest1: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest1: " + run.freeMemory() + " bytes");

        // Test 2
        System.out.println("Test 2");
        startTime1 = System.nanoTime();
        System.out.println(primetest2(10037));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest2: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest2: " + run.freeMemory() + " bytes");

        // Test 3
        System.out.println("Test 3");
        startTime1 = System.nanoTime();
        System.out.println(primetest3(10037));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest3: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest3: " + run.freeMemory() + " bytes");

        System.out.println("----------------------------------------");
        System.out.println(10012);
        // Test 1
        System.out.println("Test 1");
        startTime1 = System.nanoTime();
        System.out.println(primetest1(10012));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest1: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest1: " + run.freeMemory() + " bytes");

        // Test 2
        System.out.println("Test 2");
        startTime1 = System.nanoTime();
        System.out.println(primetest2(10012));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest2: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest2: " + run.freeMemory() + " bytes");

        // Test 3
        System.out.println("Test 3");
        startTime1 = System.nanoTime();
        System.out.println(primetest3(10012));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest3: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest3: " + run.freeMemory() + " bytes");

        System.out.println("----------------------------------------");
        System.out.println(99991);
        // Test 1
        System.out.println("Test 1");
        startTime1 = System.nanoTime();
        System.out.println(primetest1(99991));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest1: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest1: " + run.freeMemory() + " bytes");

        // Test 2
        System.out.println("Test 2");
        startTime1 = System.nanoTime();
        System.out.println(primetest2(99991));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest2: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest2: " + run.freeMemory() + " bytes");

        // Test 3
        System.out.println("Test 3");
        startTime1 = System.nanoTime();
        System.out.println(primetest3(99991));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest3: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest3: " + run.freeMemory() + " bytes");

        System.out.println("----------------------------------------");
        System.out.println(100001);
        // Test 1
        System.out.println("Test 1");
        startTime1 = System.nanoTime();
        System.out.println(primetest1(100001));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest1: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest1: " + run.freeMemory() + " bytes");

        // Test 2
        System.out.println("Test 2");
        startTime1 = System.nanoTime();
        System.out.println(primetest2(100001));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest2: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest2: " + run.freeMemory() + " bytes");

        // Test 3
        System.out.println("Test 3");
        startTime1 = System.nanoTime();
        System.out.println(primetest3(100001));
        endTime1 = System.nanoTime();
        System.out.println("Runtime for primetest3: " + (endTime1 - startTime1) + " nanoseconds");
        run = Runtime.getRuntime();
        System.out.println("Free memory after primetest3: " + run.freeMemory() + " bytes");
        System.out.println();
        }
    }
