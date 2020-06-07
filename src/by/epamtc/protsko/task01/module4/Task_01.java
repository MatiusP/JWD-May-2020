package by.epamtc.protsko.task01.module4;

public class Task_01 {

    private static double numerator(double a, double b, double c) {
        double valueUnderRoot = (b * b) + (4 * a * c);
        if (valueUnderRoot < 0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return b + Math.sqrt(valueUnderRoot);
        }
    }

    private static double denominator(double a) {
        return 2 * a;
    }

    public static double expressionResult(double a, double b, double c) {
        if (denominator(a) == 0) {
            System.out.println("Division by zero.");
            return Double.POSITIVE_INFINITY;
        }
        if (numerator(a, b, c) == Double.POSITIVE_INFINITY) {
            System.out.println("Trying to extract a root from a negative number.");
            return Double.POSITIVE_INFINITY;
        }
        return (numerator(a, b, c) / denominator(a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println("expression result: " + expressionResult(4, 1, 3));
        System.out.println("expression result: " + expressionResult(0, 3, 4));
        System.out.println("expression result: " + expressionResult(-20, 1, 3));

    }
}
