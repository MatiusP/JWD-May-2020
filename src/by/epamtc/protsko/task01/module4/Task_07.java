package by.epamtc.protsko.task01.module4;

public class Task_07 {

    private static int getWholePartOfNumber(double number) {
        return (int) (number % 1000);
    }

    private static int getFractionalPartOfNumber(double number) {
        return (int) ((number - getWholePartOfNumber(number)) * 1000);
    }

    static double getChangedNumber(double number) {
        return getFractionalPartOfNumber(number) + (double) getWholePartOfNumber(number) / 1000;
    }


    //----- check result -----
    public static void main(String[] args) {
        double number = 123.001;
        double number1 = 999.888;
        System.out.println(getChangedNumber(number));
        System.out.println(getChangedNumber(number1));
    }
}
