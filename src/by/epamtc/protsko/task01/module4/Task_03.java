package by.epamtc.protsko.task01.module4;

public class Task_03 {

    private double a;
    private double b;
    private double c;

    Task_03(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isConditionCorrect() {
        return a > b && b > c;
    }

    public static void getResult(Task_03 ob) {
        if (ob.isConditionCorrect()) {
            ob.a *= 2;
            ob.b *= 2;
            ob.c *= 2;
        } else {
            ob.a = Math.abs(ob.a);
            ob.b = Math.abs(ob.b);
            ob.c = Math.abs(ob.c);
        }
    }

    //----- check result -----
    public static void main(String[] args) {
        Task_03 ob = new Task_03(-2, -3, -5);
        getResult(ob);
        System.out.println("a=" + ob.a + ", b=" + ob.b + ", c=" + ob.c);
    }
}
