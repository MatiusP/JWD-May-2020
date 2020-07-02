package by.epamtc.protsko.task01.module4;

public class Task_03 {

    private static double a;
    private static double b;
    private static double c;

    public static void changeNumbersByCondition(double a, double b, double c) {
        if ((a > b) && (b > c)) {
            Task_03.a = a * 2;
            Task_03.b = b * 2;
            Task_03.c = c * 2;
        } else {
            Task_03.a = Math.abs(a);
            Task_03.b = Math.abs(b);
            Task_03.c = Math.abs(c);
        }
    }

    public static double getA() {
        return a;
    }

    public static double getB() {
        return b;
    }

    public static double getC() {
        return c;
    }

    //----- check result -----
    public static void main(String[] args) {
        double a = 15;
        double b = 10;
        double c = 2;

        System.out.println("Initial values: \t" + "a = " + a + ",  b = " + b + ",  c = " + c);

        changeNumbersByCondition(a, b, c);
        a = getA();
        b = getB();
        c = getC();

        System.out.println("Modified values: \t" + "a = " + a + ",  b = " + b + ",  c = " + c);
    }
}
