package by.epamtc.protsko.task01.module4;

public class Task_05 {

    private static int units(int number) {
        return number % 10;
    }

    private static int tens(int number) {
        return (number % 100 - units(number)) / 10;
    }

    private static int hundreds(int number) {
        return number / 100;
    }

    public static int digitSum(int number) {
        return units(number) + tens(number) + hundreds(number);
    }

    public static int digitMultiplication(int number) {
        return units(number) * tens(number) * hundreds(number);
    }

    public static int digitSwap(int number) {
        return tens(number) * 100 + hundreds(number) * 10 + units(number);
    }

    public static int newNumber(int number) {
        return units(number) * 1000 + number;
    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println(digitSum(137));
        System.out.println(digitMultiplication(137));
        System.out.println(digitSwap(137));
        System.out.println(newNumber(137));

        System.out.println(digitSum(-989));
        System.out.println(digitMultiplication(-989));
        System.out.println(digitSwap(-989));
        System.out.println(newNumber(-989));
    }
}
