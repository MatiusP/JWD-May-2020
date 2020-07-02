package by.epamtc.protsko.task01.module4;

public class Task_02 {

    private static byte numberOfMonth;
    private static byte dayOfMonth;

    private static String monthName(byte numberOfMonth) {
        switch (numberOfMonth) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "Mart";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Incorrect number of month";
    }


    private static int getCountDaysOfMonth(byte numberOfMonth) {
        switch (numberOfMonth) {
            case 2:
                return 28;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
        }
        return 0;
    }

    private static void dayOfMonth(int dayOfYear) {
        numberOfMonth = 1;

        while (dayOfYear > getCountDaysOfMonth(numberOfMonth)) {
            dayOfYear -= getCountDaysOfMonth(numberOfMonth);
            numberOfMonth++;
        }
        dayOfMonth = (byte) dayOfYear;
    }

    public static void dayOfMonthByDayNumber(int dayOfYear) {
        if ((dayOfYear > 0) && (dayOfYear <= 365)) {
            dayOfMonth(dayOfYear);
            System.out.println(dayOfMonth + "." + monthName(numberOfMonth));
        } else {
            System.out.println("Incorrect day of year.");
        }
    }


    //----- check result -----
    public static void main(String[] args) {
        dayOfMonthByDayNumber(15);
        dayOfMonthByDayNumber(90);
        dayOfMonthByDayNumber(128);
        dayOfMonthByDayNumber(246);
        dayOfMonthByDayNumber(273);
        dayOfMonthByDayNumber(274);
        dayOfMonthByDayNumber(303);
        dayOfMonthByDayNumber(304);
        dayOfMonthByDayNumber(305);
        dayOfMonthByDayNumber(365);
        dayOfMonthByDayNumber(367);
    }
}
