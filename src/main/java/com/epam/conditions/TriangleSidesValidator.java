package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        String triangle;
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide & secondSide + thirdSide > firstSide) {
            triangle = "this is a valid triangle";
        } else {
            triangle = "it's not a triangle";
        }
        System.out.println(triangle);
    }

}
