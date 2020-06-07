package by.epamtc.protsko.task01.module4;

public class Task_04 {

    static double getFunctionResult(double x) {
        if (x <= 13) {
            return -Math.pow(x, 3) + 9;
        }
        return -3 / (x + 1);
    }


    //----- check result -----
    public static void main(String[] args) {
        double functionResult1 = getFunctionResult(-38);
        double functionResult2 = getFunctionResult(38);

        System.out.println(functionResult1);
        System.out.println(functionResult2);
    }
}
