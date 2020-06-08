package by.epamtc.protsko.task01.module4;

public class Task_06 {

    public static long exceedingIntRange(int a1, int d) {
        long n = 1;
        int currentProgressionElement = a1;
        int nextProgressionElement;
        int progressionSum = (int) ((2 * a1) * (n / 2.0));

        while (true) {
            n++;
            nextProgressionElement = (int) (a1 + (n - 1) * d);

            if (d > 0) {
                if (currentProgressionElement > nextProgressionElement) {
                    break;
                } else if ((progressionSum + nextProgressionElement) < currentProgressionElement) {
                    break;
                }
            } else {
                if (currentProgressionElement < nextProgressionElement) {
                    break;
                } else if ((progressionSum + nextProgressionElement) > 0 &&
                        progressionSum < currentProgressionElement) {
                    break;
                }
            }
            progressionSum = (int) ((a1 + nextProgressionElement) * (n / 2.0));
            currentProgressionElement = nextProgressionElement;
        }
        return n;
    }

    public static long exceedingLongRange(long a1, long d) {
        long n = 1;
        long currentProgressionElement = a1;
        long nextProgressionElement;
        long progressionSum = (long) ((2 * a1) * (n / 2.0));

        while (true) {
            n++;
            nextProgressionElement = (a1 + (n - 1) * d);

            if (d > 0) {
                if (currentProgressionElement > nextProgressionElement) {
                    break;
                } else if ((progressionSum + nextProgressionElement) < currentProgressionElement) {
                    break;
                }
            } else {
                if (currentProgressionElement < nextProgressionElement) {
                    break;
                } else if ((progressionSum + nextProgressionElement) > 0 &&
                        progressionSum < currentProgressionElement) {
                    break;
                }
            }
            progressionSum = (long) ((a1 + nextProgressionElement) * (n / 2.0));
            currentProgressionElement = nextProgressionElement;
        }
        return n;
    }


    //----- check result -----
    public static void main(String[] args) {
        System.out.println("Integer range will be exceeded at n = " + exceedingIntRange(15, 20));
        System.out.println("Long range will be exceeded at n = " + exceedingLongRange(15, 20));

        System.out.println("Integer range will be exceeded at n = " + exceedingIntRange(-150, 3000));
        System.out.println("Long range will be exceeded at n = " + exceedingLongRange(-150, 3000));

        System.out.println("Integer range will be exceeded at n = " + exceedingIntRange(-150, 3000000));
        System.out.println("Long range will be exceeded at n = " + exceedingLongRange(-150, 3000000));

        System.out.println("Long range will be exceeded at n = " + exceedingLongRange(9900000000L, -2000000000L));

    }
}
