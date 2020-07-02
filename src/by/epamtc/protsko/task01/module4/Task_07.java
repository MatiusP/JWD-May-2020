package by.epamtc.protsko.task01.module4;

public class Task_07 {

    private static int integerPartOfNumber(double number) {
        return (int) number;
    }

    private static int fractionalPartOfNumber(double number) {
        return (int) (number * 1000) - (integerPartOfNumber(number) * 1000);
    }

    public static double modifierNumber(double number) {
        return fractionalPartOfNumber(number) + (double) integerPartOfNumber(number) / 1000;
    }


    //----- check result -----
    public static void main(String[] args) {
        double number = 123.321;
        double number1 = 999.888;

        System.out.println(modifierNumber(number));
        System.out.println(modifierNumber(number1));
    }
}
