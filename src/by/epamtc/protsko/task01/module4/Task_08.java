package by.epamtc.protsko.task01.module4;

public class Task_08 {

    public static void functionResult(double segmentStart, double segmentEnd, double step, double constant) {
        double result;
        for (double x = segmentStart; x <= segmentEnd; x += step) {
            if (x == 15) {
                result = (x + constant) * 2;
            } else {
                result = (x - constant) + 6;
            }
            System.out.println("If x = " + x + ", function result = " + result);
        }
    }


    //----- check result -----
    public static void main(String[] args) {
        double segmentStart = 15;
        double segmentEnd = 18;
        double step = 0.5;
        double constant = 1;

        functionResult(segmentStart, segmentEnd, step, constant);
    }
}
