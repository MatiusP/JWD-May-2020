package by.epam.protsko.module_4;

public class Task_08 {

    private static double firstFunctionCondition(double x, double cons) {
        return (x + cons) * 2;
    }

    private static double secondFunctionCondition(double x, double cons) {
        return (x - cons) + 6;
    }

    static double getFunctionResult(double x, double cons) {
        if (x == 15) {
            return firstFunctionCondition(x, cons);
        } else {
            return secondFunctionCondition(x, cons);
        }
    }

//      ------- var 2 ------
//    static void getFunctionResult(double minValue, double maxValue, double step, double cons) {
//        double functionResult;
//        for (double x = minValue; x <= maxValue; x += step) {
//            if (x != 15) {
//                functionResult = (x - cons) + 6;
//            } else {
//                functionResult = (x + cons) * 2;
//            }
//            System.out.println("If x =" + x + ", y =" + functionResult);
//        }
//    }


    //----- check result -----
    public static void main(String[] args) {
        double minValue = 1;
        double maxValue = 20;
        double step = 5;
        double cons = 1;
        for (double x = minValue; x <= maxValue; x += step) {
            System.out.println("If x =" + x + ", y =" + getFunctionResult(x, cons));
        }

//        ------ var 2 ------
//        getFunctionResult(minValue, maxValue, step, cons);
    }

}
