package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 0; i <= 10; i++) {
            int result = i * numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + result);
        }
    }
}
