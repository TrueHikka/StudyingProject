import java.util.Random;

public class HomeworkNumberTwo {
    static void doFirstHomework() {
        /**
         * Ger
         *
         */
        // Задание-1
        byte circlesOfHell = 9;
        System.out.println("Значение переменной circlesOfHell с типом byte = " + circlesOfHell);

        short myShort = -3333;
        System.out.println("Значение переменной myShort с типом short = " + myShort);

        int myInt = 1488;
        System.out.println("Значение переменной myInt с типом int = " + myInt);

        long myLong = 999999999L;
        System.out.println("Значение переменной myLong с типом long = " + myLong);

        float myFloat = 53.432f;
        System.out.println("Значение переменной myFloat с типом float = " + myFloat);

        double myDouble = 53.432;
        System.out.println("Значение переменной myDouble с типом double = " + myDouble);

        char myChar = '1';
        System.out.println("Значение переменной myChar с типом char = " + myChar);

        boolean myBool = true;
        System.out.println("Значение переменной myBool с типом boolean = " + myBool);

        // Задание_2
        int allPots = 120;
        int forOneClassOfWhitePots = 2;
        int forOneClassOfBrownPots = 4;

        int totalClassesInTheSchool = allPots / (forOneClassOfWhitePots + forOneClassOfBrownPots);
        int totalWhitePots = totalClassesInTheSchool * forOneClassOfWhitePots;
        int totalBrownPots = totalClassesInTheSchool * forOneClassOfBrownPots;

        System.out.println("В школе, где " + totalClassesInTheSchool + " классов, нужно " + totalWhitePots + " банок белой краски и " + totalBrownPots + " банок коричневой краски");

        // Задание_3
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int totalMonthsOfTheYear = 12;

        int mashaSalaryAfterTheIncreaseBy10 = (int) (mashaSalary * 0.1) + mashaSalary;
        int mashaAnnualSalary = mashaSalary * totalMonthsOfTheYear;
        int mashaAnnualSalaryAfterTheIncreaseBy10 = mashaSalaryAfterTheIncreaseBy10 * totalMonthsOfTheYear;
        int theDifferenceBetweenMashaIncomeForTheYear = mashaAnnualSalaryAfterTheIncreaseBy10 - mashaAnnualSalary;

        int denisSalaryAfterTheIncreaseBy10 = (int) (denisSalary * 0.1) + denisSalary;
        int denisAnnualSalary = denisSalary * totalMonthsOfTheYear;
        int denisAnnualSalaryAfterTheIncreaseBy10 = denisSalaryAfterTheIncreaseBy10 * totalMonthsOfTheYear;
        int theDifferenceBetweenDenisIncomeForTheYear = denisAnnualSalaryAfterTheIncreaseBy10 - denisAnnualSalary;

        int kristinaSalaryAfterTheIncreaseBy10 = (int) (kristinaSalary * 0.1) + kristinaSalary;
        int kristinaAnnualSalary = kristinaSalary * totalMonthsOfTheYear;
        int kristinaAnnualSalaryAfterTheIncreaseBy10 = kristinaSalaryAfterTheIncreaseBy10 * totalMonthsOfTheYear;
        int theDifferenceBetweenKristinaIncomeForTheYear = kristinaAnnualSalaryAfterTheIncreaseBy10 - kristinaAnnualSalary;

        System.out.println("Маша теперь получает " + mashaSalaryAfterTheIncreaseBy10 + " рублей. Годовой доход вырос на " + theDifferenceBetweenMashaIncomeForTheYear + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryAfterTheIncreaseBy10 + " рублей. Годовой доход вырос на " + theDifferenceBetweenDenisIncomeForTheYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryAfterTheIncreaseBy10 + " рублей. Годовой доход вырос на " + theDifferenceBetweenKristinaIncomeForTheYear + " рублей");

        // Задание_4
        Random rand = new Random();

        int minTemp = -50;
        int maxTemp = 50;

        int diff = maxTemp - minTemp;

        int randomNumber = rand.nextInt(diff + 1) + minTemp;

        if (randomNumber < 5) {
            System.out.println("На улице " + randomNumber + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + randomNumber + " градусов, можно идти без шапки");
        }

        // Задание_5
        Random random = new Random();

        int minMonth = 1;
        int maxMonth = 12;

        int diffMonth = maxMonth - minMonth;

        int randomMonth = random.nextInt(diffMonth + 1) + minMonth;

        switch (randomMonth) {
            case 12, 1, 2:
                System.out.println("Месяц под номером " + randomMonth + " принадлежит зимнему сезону");
                break;
            case 3, 4, 5:
                System.out.println("Месяц под номером " + randomMonth + " принадлежит весеннему сезону");
                break;
            case 6, 7, 8:
                System.out.println("Месяц под номером " + randomMonth + " принадлежит летнему сезону");
                break;
            case 9, 10, 11:
                System.out.println("Месяц под номером " + randomMonth + " принадлежит осеннему сезону");
                break;
            default:
                System.out.println("Месяц под номером " + randomMonth + " не существует");
        }

        // Задание_6
        System.out.print("Четные числа: ");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Задание_7
        System.out.print("Числа от 10 до 1: ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Задание_8
        int countMonth = 0;
        int initialCash = 0;
        int totalCash = 2459000;
        int moneySafePerMonth = 15000;
        int currentCash = initialCash;

        while (currentCash <= totalCash) {
            currentCash += moneySafePerMonth;
            countMonth++;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений = " + currentCash + " рублей");
    }
}

