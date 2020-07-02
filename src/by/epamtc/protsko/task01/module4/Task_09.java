package by.epamtc.protsko.task01.module4;

public class Task_09 {

    public static long functionResult(int limitOfGrowth) {
        int elementSum = 1;
        long result = 1;

        for (int i = 2; i <= limitOfGrowth; i++) {
            elementSum += i;
            result *= elementSum;
        }
        return result;
    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println(functionResult(10)); //answer
        System.out.println(functionResult(15));
    }
}
