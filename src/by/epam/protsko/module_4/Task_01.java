package by.epam.protsko.module_4;

public class Task_01 {

    private static double numerator(double a, double b, double c) {
        return b + Math.sqrt((b * b) + 4 * a * c);
    }

    private static double denominator(double a) {
        return 2 * a;
    }

    static double expressionResult(double a, double b, double c) {
        return numerator(b, a, c) / denominator(a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println(expressionResult(1, 5, 6));
        System.out.println(expressionResult(2, 3, 4));
    }
}
