import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Primelists {



    public static void primelist1(int n) {
        boolean isprime = true;
        System.out.print("2 is prime");
        int i;

        for (int j = 3; j <= n; j++) {
            isprime = true;
            for (i = 2; i < j; i++) {
                if (j%i ==0) {
                    isprime = false;
                }
            }
            if (isprime) {
                //System.out.println(j +" is prime");
            }
        }
    }

    public static void primelist2(int n) {
        boolean isprime = true;
        System.out.print("2 is prime");
        int i;

        for (int j = 3; j <= n; j++) {
            isprime = true;
            for (i = 2; i < Math.pow(j,0.5); i++) {
                if (j%i ==0) {
                    isprime = false;
                }
            }
            if (isprime) {
                //System.out.println(j +" is prime");
            }
        }
    }

    public static void primelist3(int n) {
        boolean isprime = true;
        System.out.print("2 is prime");
        int i;

        for (int j = 3; j <= n; j++) {
            isprime = true;
            for (i = 2; i < Math.pow(j,0.5); i++) {
                if (j%i ==0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                //System.out.println(j +" is prime");
            }
        }
    }
    public static void primelist4(int n) {
        boolean isprime = true;
        ArrayList<Integer> primelist = new ArrayList<>();
        System.out.print("2 is prime");
        int i;

        primelist.add(2);

        for (int j = 3; j <= n; j++) {
            isprime = true;
            for (i = 0; i < primelist.size(); i++) {
                if (j%primelist.get(i) ==0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                //System.out.println(j +" is prime");
                primelist.add(j);
            }
        }
        for (i = 0; i < primelist.size(); i++) {
            //System.out.println(primelist.get(i) + " is prime");
        }
    }



    public static void main(String[] args) {

        //---------------------------------------------------------------------
        System.out.println();
        System.out.println("PrimeLists");
        System.out.println();
        System.out.println(1000);
        long startTime = System.nanoTime();
        primelist1(1000);
        long endTime = System.nanoTime();
        System.out.println("Runtime for primelist1: " + (endTime - startTime) + " nanoseconds");
        Runtime run1 = Runtime.getRuntime();
        System.out.println("Free memory rafter primelist1: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist2(1000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist2: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist2: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist3(1000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist3: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist3: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist4(1000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist4: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist4: " + run1.freeMemory() + " bytes");

        System.out.println("----------------------------------------");

        System.out.println(10000);
        startTime = System.nanoTime();
        primelist1(10000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist1: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist1: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist2(10000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist2: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist2: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist3(10000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist3: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist3: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist4(10000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist4: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist4: " + run1.freeMemory() + " bytes");

        System.out.println("----------------------------------------");

        System.out.println(100000);
        startTime = System.nanoTime();
        primelist1(100000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist1: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist1: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist2(100000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist2: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist2: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist3(100000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist3: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist3: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist4(100000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist4: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist4: " + run1.freeMemory() + " bytes");

        System.out.println("----------------------------------------");

        System.out.println(1000000);
        startTime = System.nanoTime();
        primelist1(1000000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist1: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist1: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist2(1000000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist2: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist2: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist3(1000000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist3: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist3: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist4(1000000);
        endTime = System.nanoTime();
        System.out.println("Runtime for primelist4: " + (endTime - startTime) + " nanoseconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist4: " + run1.freeMemory() + " bytes");

        System.out.println("----------------------------------------");

        System.out.println(10000000);
        startTime = System.nanoTime();
        primelist1(10000000);
        endTime = System.nanoTime();
        double runtimeInSeconds = (endTime - startTime) / 1e9;
        System.out.println("Runtime for primelist1: " + (runtimeInSeconds) + " seconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist1: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist2(10000000);
        endTime = System.nanoTime();
        runtimeInSeconds = (endTime - startTime) / 1e9;
        System.out.println("Runtime for primelist2: " + (runtimeInSeconds) + " seconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist2: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist3(10000000);
        endTime = System.nanoTime();
        runtimeInSeconds = (endTime - startTime) / 1e9;
        System.out.println("Runtime for primelist3: " + (runtimeInSeconds) + " seconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist3: " + run1.freeMemory() + " bytes");

        startTime = System.nanoTime();
        primelist4(10000000);
        endTime = System.nanoTime();
        runtimeInSeconds = (endTime - startTime) / 1e9;
        System.out.println("Runtime for primelist4: " + (runtimeInSeconds) + " seconds");
        run1 = Runtime.getRuntime();
        System.out.println("Free memory after primelist4: " + run1.freeMemory() + " bytes");

    }
}