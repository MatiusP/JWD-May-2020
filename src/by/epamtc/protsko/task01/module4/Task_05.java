package by.epamtc.protsko.task01.module4;

public class Task_05 {

    private static int getUnits(int number) {
        return number % 10;
    }

    private static int getTens(int number) {
        return (number % 100 - getUnits(number)) / 10;
    }

    private static int getHundreds(int number) {
        return number / 100;
    }

    static int getDigitSum(int number) {
        return getUnits(number) + getTens(number) + getHundreds(number);
    }

    static int getDigitMultiplication(int number) {
        return getUnits(number) * getTens(number) * getHundreds(number);
    }

    static int getDigitSwap(int number) {
        return getTens(number) * 100 + getHundreds(number) * 10 + getUnits(number);
    }

    static int getNewNumber(int number) {
        return getUnits(number) * 1000 + number;
    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println(getDigitSum(137));
        System.out.println(getDigitMultiplication(137));
        System.out.println(getDigitSwap(137));
        System.out.println(getNewNumber(137));

        System.out.println(getDigitSum(-989));
        System.out.println(getDigitMultiplication(-989));
        System.out.println(getDigitSwap(-989));
        System.out.println(getNewNumber(-989));
    }
}
