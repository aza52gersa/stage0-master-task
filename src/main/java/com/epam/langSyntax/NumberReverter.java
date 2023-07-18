package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int lastTwoDigits = number % 100;
        int firstDigit = number / 100 % 10;
        System.out.println(lastTwoDigits + "" + firstDigit);
    }
}
