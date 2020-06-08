package by.epamtc.protsko.task01.module4;

public class Task_02 {

    static byte numberOfMonth;
    static byte dayOfMonth;

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

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 0;
    }

    private static void getDayOfMonth(int dayOfYear) {
        numberOfMonth = 1;

        while (dayOfYear > getCountDaysOfMonth(numberOfMonth)) {
            dayOfYear -= getCountDaysOfMonth(numberOfMonth);
            numberOfMonth++;
        }
        dayOfMonth = (byte) dayOfYear;
    }

    static void getDayMonthByDayNumber(int dayOfYear) {
        if ((dayOfYear > 0) && (dayOfYear <= 365)) {
            getDayOfMonth(dayOfYear);
            System.out.println(dayOfMonth + "." + monthName(numberOfMonth));
        } else {
            System.out.println("Incorrect day of year.");
        }
    }


    //----- check result -----
    public static void main(String[] args) {
        getDayMonthByDayNumber(15);
        getDayMonthByDayNumber(90);
        getDayMonthByDayNumber(128);
        getDayMonthByDayNumber(246);
        getDayMonthByDayNumber(273);
        getDayMonthByDayNumber(274);
        getDayMonthByDayNumber(303);
        getDayMonthByDayNumber(304);
        getDayMonthByDayNumber(305);
        getDayMonthByDayNumber(365);
        getDayMonthByDayNumber(367);
    }
}
