package by.epamtc.protsko.task01.module4;

public class Task_03 {

    static double doublingNumber(double number) {
        return number * 2;
    }

    static double absoluteValueOfNumber(double number) {
        return Math.abs(number);
    }


    //----- check result -----
    public static void main(String[] args) {
        double a = 15;
        double b = 10;
        double c = 2;

        if ((a > b) && (b > c)) {
            a = doublingNumber(a);
            b = doublingNumber(b);
            c = doublingNumber(c);
        } else {
            a = absoluteValueOfNumber(a);
            b = absoluteValueOfNumber(b);
            c = absoluteValueOfNumber(c);
        }
        System.out.println("a=" + a + "\n" + "b=" + b + "\n" + "c=" + c);
    }
}
