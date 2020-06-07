package by.epamtc.protsko.task01.module4;

public class Task_08 {

    static void getFunctionResult(double segmentStart, double segmentEnd, double step, double constant) {
        double functionResult;
        for (double x = segmentStart; x <= segmentEnd; x += step) {
            if (x == 15) {
                functionResult = (x + constant) * 2;
            } else {
                functionResult = (x - constant) + 6;
            }
            System.out.println("If x = " + x + ", function result = " + functionResult);
        }
    }


    //----- check result -----
    public static void main(String[] args) {
        double segmentStart = 15;
        double segmentEnd = 18;
        double step = 0.5;
        double constant = 1;

        getFunctionResult(segmentStart, segmentEnd, step, constant);
    }
}
