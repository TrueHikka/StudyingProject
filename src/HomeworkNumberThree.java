import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Random;

public class HomeworkNumberThree {
    //task-1
    static void task1(int firstAbroad, int secondAbroad) {
        Random rand1 = new Random();
        int randomNumForArrLength = rand1.nextInt(secondAbroad - firstAbroad + 1) + firstAbroad;
        int[] randomArr = new int[randomNumForArrLength];
        for (int i = 0; i < randomArr.length; i++) {
            Random rand2 = new Random();
            int randomNumForArrValues = rand2.nextInt(secondAbroad - firstAbroad + 1) + firstAbroad;
            randomArr[i] = randomNumForArrValues;
        }
        System.out.println(Arrays.toString(randomArr));
    }

    //task-2
    static void task2() {
        System.out.print("Нечетные числа: ");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //task-3
    static String task3(double max) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');

        DecimalFormat df = new DecimalFormat("#.00", symbols);

        double sumNum = 0;
        double[] arrWithRandomDoubleNum = new double[10];
        for (int i = 0; i < arrWithRandomDoubleNum.length; i++) {
            double randNum = Math.random() * max;
            arrWithRandomDoubleNum[i] = randNum;
            sumNum += arrWithRandomDoubleNum[i];
        }
        return "Sum: " + df.format(sumNum);
    }

    //task-4
    static String task4(String[] array) {
        StringBuilder concatenatedString = concat(array);
        return concatenatedString.toString();
    }

    static StringBuilder concat(String[] stringArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            sb.append(stringArray[i]);
            if (i < stringArray.length - 1 && !stringArray[i + 1].endsWith(".")) {
                sb.append(" ");
            }
        }
        return sb;
    }
}