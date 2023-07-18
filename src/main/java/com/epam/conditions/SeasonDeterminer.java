package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String nameOfAMonth;

        switch (monthNumber) {
            case 1, 2, 12:
                nameOfAMonth = "Winter";
                break;
            case 3, 4, 5:
                nameOfAMonth = "Spring";
                break;
            case 6, 7, 8:
                nameOfAMonth = "Summer";
                break;
            case 9, 10, 11:
                nameOfAMonth = "Autumn";
                break;
            default:
                nameOfAMonth = "Wrong month number";
                break;
        }
        System.out.println(nameOfAMonth);
    }

}
