package by.epamtc.protsko.task01.module4;

public class Task_09 {

    public static long getFunctionResult(int limitOfGrowth) {
        int elementSum = 1;
        long functionResult = 1;

        for (int i = 2; i <= limitOfGrowth; i++) {
            elementSum += i;
            functionResult *= elementSum;
        }
        return functionResult;
    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println(getFunctionResult(10)); //answer
        System.out.println(getFunctionResult(15));
    }
}
