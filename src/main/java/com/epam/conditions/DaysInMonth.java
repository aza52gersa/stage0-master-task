package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int dayInMonth;
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
            case 4,6,9,11:
                dayInMonth = 30;
                break;
            default:
                dayInMonth = 31;
                break;
        }
        System.out.println(dayInMonth);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
