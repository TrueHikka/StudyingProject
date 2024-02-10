
public class Main {
    public static void main(String[] args) {
        HomeworkNumberTwo.doFirstHomework();

        HomeworkNumberThree.task1(10, 50);
        HomeworkNumberThree.task2();
        String sumDouble =  HomeworkNumberThree.task3(100);
        System.out.println(sumDouble);
        String[] arr = {"Сегодня", "на", "улице", "идет", "дождь", "."};
        String concatenatedString = HomeworkNumberThree.task4(arr);
        System.out.println(concatenatedString);

        //task-1 (dz-4)
        int number = 10;
        int recursionSumNumbers = HomeworkNumberFour.recursionCalculation(number);
        System.out.println(recursionSumNumbers);

        //task-2 (dz-4)
        long factNum = 7;
        long factorial = HomeworkNumberFour.factorialCalculating(factNum);
        System.out.println(factorial);

        //task-3 (dz-4)
        int fibNum = 7;
        int fibonacci = HomeworkNumberFour.fibonacciCalculating(fibNum);
        System.out.println(fibonacci);

        //task-4 (dz-4)
        int primitiveInt = 10;
        System.out.println("This value is int - " + primitiveInt);
        Integer valueInt = HomeworkNumberFour.primitiveIntInIntCLass(primitiveInt);
        System.out.println("This value is Integer - " + valueInt);

        double primitiveDouble = 10.10;
        System.out.println("This value is double - " + primitiveDouble);
        Double valueDouble = HomeworkNumberFour.primitiveDoubleInDoubleCLass(primitiveDouble);
        System.out.println("This value is Double - " + valueDouble);

        boolean primitiveBoolean = true;
        System.out.println("This value is boolean - " + primitiveBoolean);
        Boolean valueBool = HomeworkNumberFour.primitiveBooleanInBoolCLass(primitiveBoolean);
        System.out.println("This value is Boolean - " + valueBool);

        //task-5 (dz-4)
        HomeworkNumberFour.intAndIntegerSum();
        HomeworkNumberFour.doubleAndDoubleSum();

        //task-6 (dz-4)
        HomeworkNumberFour.comparingVariables();


        //task-7 (dz-4)
        int count = 100_000_000;
        HomeworkNumberFour.checkTimeWithPrimitive(count);
        HomeworkNumberFour.checkTimeWithWrapper(count);

        //task-8 (dz-4)
        HomeworkNumberFour.overFlowTest();
    }
}
