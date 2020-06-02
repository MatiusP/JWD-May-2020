package by.epam.protsko.module_4;

public class Task_06 {

    private static double getNextProgressiveMember(int d, long n) {
        return (n - 1) * d;
    }

    private static double getProgressionResult(int a1, int d, long n) {
            return (2 * a1 + getNextProgressiveMember(d, n)) * n / 2;
        }

    static long exceedingIntRange(int a1, int d) {
        long n = 1;
        double result = 0;
        while (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
            n++;
            result = getProgressionResult(a1, d, n);
        }
        return n;
    }

    static long exceedingLongRange(int a1, int d) {
        long n = 1;
        double result = 0;
        while (result >= Long.MIN_VALUE && result <= Long.MAX_VALUE) {
            n++;
            result = getProgressionResult(a1, d, n);
        }
        return n;
    }


    //----- check result -----
    public static void main(String[] args) {
        int a1 = 15;
        int d = -20;
        System.out.println("Integer range will be exceeded at n = " + exceedingIntRange(a1, d));
        System.out.println("Long range will be exceeded at n = " + exceedingLongRange(a1, d));

    }
}
