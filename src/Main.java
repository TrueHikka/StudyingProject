import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //task-1 (dz-5)
        Book solaris = new Book("Solaris", new Book.Author("Stanislaw", "Lem"), 1961);
        solaris.checkNameAuthor(solaris.getAuthor());
        System.out.println(solaris);
        System.out.println(solaris.checkNameAuthor(solaris.getAuthor()));

        Book trainspotting = new Book("Trainspotting", new Book.Author("Irvine", "Welsh"), 1993);
        trainspotting.checkNameAuthor(solaris.getAuthor());
        System.out.println(trainspotting);
        System.out.println(trainspotting.checkNameAuthor(trainspotting.getAuthor()));
        trainspotting.setYearPublicationBook(1488);
        System.out.println(trainspotting);

        //task-2 (dz-5)
        int primitive = 5;
        System.out.println("Primitive before method: " + primitive);
        changePrimitive(primitive);
        System.out.println("Primitive after method: " + primitive);

        String initialObjectValue = "Initial";
        MyObject obj = new MyObject(initialObjectValue);
        System.out.println("Object before method: " + obj.getValue());
        changeObject(obj);
        System.out.println("Object after method: " + obj.getValue());

//        HomeworkNumberTwo.doFirstHomework();
//
//        HomeworkNumberThree.task1(10, 50);
//        HomeworkNumberThree.task2();
//        String sumDouble =  HomeworkNumberThree.task3(100);
//        System.out.println(sumDouble);
//        String[] arr = {"Сегодня", "на", "улице", "идет", "дождь", "."};
//        String concatenatedString = HomeworkNumberThree.task4(arr);
//        System.out.println(concatenatedString);
//
//        //task-1 (dz-4)
//        int number = 10;
//        int recursionSumNumbers = HomeworkNumberFour.recursionCalculation(number);
//        System.out.println(recursionSumNumbers);
//
//        //task-2 (dz-4)
//        long factNum = 7;
//        long factorial = HomeworkNumberFour.factorialCalculating(factNum);
//        System.out.println(factorial);
//
//        //task-3 (dz-4)
//        int fibNum = 7;
//        int fibonacci = HomeworkNumberFour.fibonacciCalculating(fibNum);
//        System.out.println(fibonacci);
//
//        //task-4 (dz-4)
//        int primitiveInt = 10;
//        System.out.println("This value is int - " + primitiveInt);
//        Integer valueInt = HomeworkNumberFour.primitiveIntInIntCLass(primitiveInt);
//        System.out.println("This value is Integer - " + valueInt);
//
//        double primitiveDouble = 10.10;
//        System.out.println("This value is double - " + primitiveDouble);
//        Double valueDouble = HomeworkNumberFour.primitiveDoubleInDoubleCLass(primitiveDouble);
//        System.out.println("This value is Double - " + valueDouble);
//
//        boolean primitiveBoolean = true;
//        System.out.println("This value is boolean - " + primitiveBoolean);
//        Boolean valueBool = HomeworkNumberFour.primitiveBooleanInBoolCLass(primitiveBoolean);
//        System.out.println("This value is Boolean - " + valueBool);
//
//        //task-5 (dz-4)
//        HomeworkNumberFour.intAndIntegerSum();
//        HomeworkNumberFour.doubleAndDoubleSum();
//
//        //task-6 (dz-4)
//        HomeworkNumberFour.comparingVariables();
//
//
//        //task-7 (dz-4)
//        int count = 100_000_000;
//        HomeworkNumberFour.checkTimeWithPrimitive(count);
//        HomeworkNumberFour.checkTimeWithWrapper(count);
//
//        //task-8 (dz-4)
//        HomeworkNumberFour.overFlowTest();
    }

    ////task-2 (dz-5)
    public static void changePrimitive(int num) {
        System.out.println("Primitive inside method before change: " + num);
        num = 10;
        System.out.println("Primitive inside method after change: " + num);
    }

    public static void changeObject(MyObject obj) {
        System.out.println("Object inside method before change: " + obj.getValue());
        obj.setValue("Changed");
        System.out.println("Object inside method after change: " + obj.getValue());
    }
}
