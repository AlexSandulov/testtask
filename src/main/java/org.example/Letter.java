package org.example;

import java.util.Scanner;

public class Letter {

    private String exit;
    private double letterOneSideOne;
    private double letterOneSideTwo;
    private double letterTwoSideOne;
    private double letterTwoSideTwo;

    public void Calculate(double letterOneSideOne, double letterOneSideTwo,
                          double letterTwoSideOne, double letterTwoSideTwo) {
        Scanner scan = new Scanner(System.in);
        do {
            if (letterOneSideOne > letterTwoSideOne && letterOneSideTwo > letterTwoSideTwo) {
                System.out.println("Second Envelope could be placed inside the First Envelope");
            } else if (letterOneSideOne < letterTwoSideOne && letterOneSideTwo < letterTwoSideTwo) {
                System.out.println("First Envelope could be placed inside the Second Envelope");
            } else {
                System.out.println("Envelopes cannot be placed in each other");
            }
            System.out.print("Do you want to continue? (y/n): ");
            exit = scan.next();
        } while (!exit.equals("n"));
        scan.close();
    }

    public void setLetterOneSideOne(double letterOneSideOne) {
        this.letterOneSideOne = letterOneSideOne;
    }

    public void setLetterOneSideTwo(double letterOneSideTwo) {
        this.letterOneSideTwo = letterOneSideTwo;
    }

    public void setLetterTwoSideOne(double letterTwoSideOne) {
        this.letterTwoSideOne = letterTwoSideOne;
    }

    public void setLetterTwoSideTwo(double letterTwoSideTwo) {
        this.letterTwoSideTwo = letterTwoSideTwo;
    }
}
