package by.epamtc.protsko.task01.module4;

import java.util.Scanner;

public class Task_10 {
    static int number;
    static int nextNumber;
    static boolean isEnterCorrect = true;
    static boolean isSequenceIncreasing = true;
    static boolean isHasSameAdjacentNumbers = false;
    static boolean isSignOfNumberVarious = true;
    static int numberCount;


    private static int getEnteredIntData() {
        int enteredData;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext() & scanner.hasNextInt()) {
            enteredData = scanner.nextInt();
            return enteredData;
        } else {
            System.out.println("Incorrect value entry!");
            isEnterCorrect = false;
        }
        return 0;
    }

    public static boolean checkCountEnteredData() {
        if (!isEnterCorrect) {
            return false;
        }
        if (numberCount != 2) {
            System.out.println("You entered less than two numbers");
            return false;
        }
        return true;
    }

    public static void readSequence() {
        number = getEnteredIntData();
        if (number != 0) {
            do {
                nextNumber = getEnteredIntData();
                if (nextNumber != 0) {
                    isSequenceIncreasing();
                    isHasSameAdjacentNumbers();
                    isAlternatingCharacters();
                    numberCount = 2;
                }
                number = nextNumber;
            } while (nextNumber != 0);
        }
    }


    public static boolean isSequenceIncreasing() {
        if (nextNumber < number && nextNumber != 0) {
            isSequenceIncreasing = false;
        }
        return isSequenceIncreasing;
    }

    public static boolean isHasSameAdjacentNumbers() {
        if (nextNumber == number && nextNumber != 0) {
            isHasSameAdjacentNumbers = true;
        }
        return isHasSameAdjacentNumbers;
    }

    public static boolean isAlternatingCharacters() {
        if (nextNumber != 0 && ((double) number / nextNumber >= 0)) {
            isSignOfNumberVarious = false;
        }
        return isSignOfNumberVarious;
    }


    //----- check result -----
    public static void main(String[] args) {
        readSequence();
        if (checkCountEnteredData()) {
            System.out.println(isSequenceIncreasing() ? "The sequence is increasing" : "The sequence is not increasing");
            System.out.println(isHasSameAdjacentNumbers() ? "The sequence has same adjacent numbers" :
                    "The sequence has't same adjacent numbers");
            System.out.println(isAlternatingCharacters() ? "All numbers in the sequence have different signs." :
                    "Not all numbers in the sequence have different signs.");
        }
    }
}
