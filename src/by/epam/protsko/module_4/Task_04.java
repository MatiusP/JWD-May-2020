package by.epam.protsko.module_4;

public class Task_04 {

    static double getFunctionResult(double x) {
        if (x <= 13) {
            return -Math.pow(x, 3) + 9;
        }
        return -3 / (x + 1);
    }

    static void printResult(double x) {
        System.out.println(getFunctionResult(x));
    }


    //----- check result -----
    public static void main(String[] args) {
        double res = getFunctionResult(-38);
        System.out.println(res);
        printResult(-38);
    }
}
