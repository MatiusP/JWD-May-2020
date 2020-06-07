package by.epamtc.protsko.task01.module4;

public class Task_07 {

    private static int getIntegerPartOfNumber(double number) {
        return (int) number;
    }

    private static int getFractionalPartOfNumber(double number) {
        return (int) (number * 1000) - (getIntegerPartOfNumber(number) * 1000);
    }

    static double getNewNumber(double number) {
        return getFractionalPartOfNumber(number) + (double) getIntegerPartOfNumber(number) / 1000;
    }


    //----- check result -----
    public static void main(String[] args) {
        double number = 123.321;
        double number1 = 999.888;

        System.out.println(getNewNumber(number));
        System.out.println(getNewNumber(number1));
    }
}
