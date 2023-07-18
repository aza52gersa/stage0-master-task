package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int fourthDigit = number % 10;
        System.out.println(firstDigit + secondDigit + thirdDigit + fourthDigit);
    }
}
