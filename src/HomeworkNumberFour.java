import java.util.Objects;

public class HomeworkNumberFour {
    //task-1
    static int recursionCalculation(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + recursionCalculation(num - 1);
        }
    }

    //task-2
    static long factorialCalculating(long f) {
        if (f == 0) {
            return 1;
        } else {
            return f * factorialCalculating(f - 1);
        }
    }

    //task-3
    static int fibonacciCalculating(int fib) {
        if (fib <= 1) {
            return fib;
        } else {
            return fibonacciCalculating(fib - 1) + fibonacciCalculating(fib - 2);
        }
    }

    //task-4
    static Integer primitiveIntInIntCLass(int num) {
        Integer boxedNum = Integer.valueOf(num);
        return boxedNum;
    }

    static Double primitiveDoubleInDoubleCLass(double num) {
        Double boxedNum = Double.valueOf(num);
        return boxedNum;
    }

    static Boolean primitiveBooleanInBoolCLass(boolean bool) {
        Boolean boxedBool = Boolean.valueOf(bool);
        return boxedBool;
    }

    //task-5 (dz-4)
    static void intAndIntegerSum() {
        int a = 10;
        Integer b = 20;

        int sum = a + b;
        Integer sum2 = a + b;

        System.out.println("This sum an int type " + sum);
        System.out.println("Is the sum2 an Integer type? " + (sum2 instanceof Integer));
    }

    static void doubleAndDoubleSum() {
        double c = 10.9;
        Double d = 20.9;

        double sum = c + d;
        Double sum2 = c + d;

        System.out.println("This sum an double type " + sum);
        System.out.println("Is the sum2 an Double type? " + (sum2 instanceof Double));
    }


    //task-6 (dz-4)
      static void comparingVariables() {
          for (int i = -128; i <= 127; i++) {
              Integer i1 = i;
              Integer i2 = i;
              System.out.println("Value: " + i + ", using '==': " + (i1 == i2) +
                      ", using Objects.equals(): " + Objects.equals(i1, i2));
          }

          for (int i = -129; i <= 128; i++) {
              Integer i1 = i;
              Integer i2 = i;
              System.out.println("Value: " + i + ", using '==': " + (i1 == i2) +
                      ", using Objects.equals(): " + Objects.equals(i1, i2));
          }

          for (int i = 128; i <= 130; i++) {
              Integer i1 = i;
              Integer i2 = i;
              System.out.println("Value: " + i + ", using '==': " + (i1 == i2) +
                      ", using Objects.equals(): " + Objects.equals(i1, i2));
          }
      }


    //task-7 (dz-4)
    static void checkTimeWithPrimitive(int count) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
    }

    static void checkTimeWithWrapper(int count) {
        long startTime = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
    }

    //task-8 (dz-4)
    static void overFlowTest() {
        Integer integerVar = Integer.MAX_VALUE;
        Long longVar = Long.MAX_VALUE;

        System.out.println("Before overflow:");
        System.out.println("Integer: " + integerVar);
        System.out.println("Long: " + longVar);

        integerVar++;
        longVar++;

        System.out.println("\nAfter overflow:");
        System.out.println("Integer: " + integerVar);
        System.out.println("Long: " + longVar);

        integerVar = Integer.MIN_VALUE;
        longVar = Long.MIN_VALUE;

        System.out.println("\nBefore underflow:");
        System.out.println("Integer: " + integerVar);
        System.out.println("Long: " + longVar);

        integerVar--;
        longVar--;

        System.out.println("\nAfter underflow:");
        System.out.println("Integer: " + integerVar);
        System.out.println("Long: " + longVar);
    }
}