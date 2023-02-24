public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 127;
        System.out.println("Значение переменной b с типом byte равно " + a);
        short b = 32767;
        System.out.println("Значение переменной c с типом short равно " + b);
        int c = 2147483647;
        System.out.println("Значение переменной a с типом int равно " + c);
        long d = 9223372036854775807L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.11495844875346f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.19390456346870583541735217174689452;
        System.out.println("Значение переменной e с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Существуют следующие типы переменных: byte; short; int; long; float; double; char; boolean");
        byte a = 67;
        System.out.println("Значение переменной e с типом byte равно " + a);
        short b = 569;
        System.out.println("Значение переменной d с типом short равно " + b);
        short c = -159;
        System.out.println("Значение переменной e с типом short равно " + c);
        short d = 27897;
        System.out.println("Значение переменной e с типом short равно " + d);
        long e = 987678965549L;
        System.out.println("Значение переменной b с типом long равно " + e);
        float f = 27.12f;
        System.out.println("Значение переменной a с типом float равно " + f);
        float g = 2.786f;
        System.out.println("Значение переменной c с типом float равно " + g);

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short totalSheets = 480;
        short totalSchoolchildren = (short) (LP + AS + EA);
        short sheetsEach = (short) (totalSheets / totalSchoolchildren);
        System.out.println("На каждого ученика рассчитано " + sheetsEach + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte numberBottles = 16;
        byte minutes = 2;
        short machinePerformanceInMinute = (short) (numberBottles / minutes);
        short machinePerformance1 = (short) (machinePerformanceInMinute * 20);
        System.out.println("За 20 минут машина произвела " + machinePerformance1 + " штук бутылок");
        byte hour = 60;
        byte period3 = 24;
        short period4 = (short) (period3 * hour);
        short machinePerformancePerDay = (short) (machinePerformanceInMinute * period4);
        System.out.println("За сутки машина произвела " + machinePerformancePerDay + " штук бутылок");
        byte days = 3;
        int machinePerformance2 = machinePerformancePerDay * days;
        System.out.println("За 3 дня машина произвела " + machinePerformance2 + " штук бутылок");
        byte days2 = 30;
        int machinePerformance3 = machinePerformancePerDay * days2;
        System.out.println("За месяц машина произвела " + machinePerformance3 + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        byte totalPerClass = (byte) (whiteOneClass + brownOneClass);
        byte totalClasses = (byte) (totalCans / totalPerClass);
        byte allWhite = (byte) (totalClasses * whiteOneClass);
        byte justBrown = (byte) (totalClasses * brownOneClass);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + allWhite + " банок белой краски и " + justBrown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaWeight = 80;
        short milkMl = 200;
        byte milkGrWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggsWeight = 70;
        short totalBananas = (short) (bananas * bananaWeight);
        short totalMilk = (short) (milkMl * milkGrWeight / 1000);
        short totalIceCream = (short) (iceCream * iceCreamWeight);
        short totalEggs = (short) (eggs * eggsWeight);
        short totalWeightGram = (short) (totalBananas + totalMilk + totalIceCream + totalEggs);
        float totalWeightKg = totalWeightGram / 1000f;
        System.out.println("Вес завтрака в граммах - " + totalWeightGram + " гр. В килограммах " + totalWeightKg + " кг.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte weightKilograms = 7;
        short weightGrams = (short) (weightKilograms * 1000);
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        byte weightLossPerDay1 = (byte) (weightGrams / weightLoss1);
        byte weightLossPerDay2 = (byte) (weightGrams / weightLoss2);
        byte average = (byte) ((byte) (weightLossPerDay1 + weightLossPerDay2) / 2);
        System.out.println("Чтобы сбросить 7кг худея по 250г в день спортсмену потребуется - " + weightLossPerDay1 + " дней. " +
                "Если спортсмен будет худеть по 500г в день, ему потребуется - " + weightLossPerDay2 + " дней. В среднем ему потребудется - " + average + " день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int Mary = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        byte salaryIncrease = 10;
        float salaryIncreaseMary = (short) ((Mary / 100f) * salaryIncrease);
        int newSalaryMary = (int) (Mary + salaryIncreaseMary);
        float salaryIncreaseDenis = (short) ((Denis / 100f) * salaryIncrease);
        int newSalaryDenis = (int) (Denis + salaryIncreaseDenis);
        float salaryIncreaseKristina = (short) ((Kristina / 100f) * salaryIncrease);
        int newSalaryKristina = (int) (Kristina + salaryIncreaseKristina);
        int annualIncomeMary = (int) (salaryIncreaseMary * 12);
        int annualIncomeDenis = (int) (salaryIncreaseDenis * 12);
        int annualIncomeKristina = (int) (salaryIncreaseKristina * 12);
        System.out.println("Маша теперь получает " + newSalaryMary + " рублей. Годовой доход вырос на " + annualIncomeMary + " рублей." +
                " Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей." +
                " Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей.");
    }
}