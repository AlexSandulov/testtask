package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String option;
        String proceed = "yes";
        Scanner sc = new Scanner(System.in);

        while ("yes".equalsIgnoreCase(proceed)) {
            System.out.print("Hello, User! Please make a choice, you can start program Triangle, " +
                    "Letter or Chess. Type the full program name: ");
            option = sc.next();
            switch (option.toLowerCase()) {
                case "triangle":
                    Triangle triangle = new Triangle();
                    triangle.TriangleCalculate();
                    break;

                case "letter":
                    Letter letter = new Letter();
                    ReadInput readLetter = new ReadInput();
                    readLetter.setText("Please enter dimensions (HxW) for the envelopes in format XX.XX, " +
                            "first two chars are for First envelope, other two chars are for the Second envelope: ");
                    String[] dataLetter = readLetter.getParam().split(", ");
                    double letterOneSideOne = Double.parseDouble(dataLetter[0]);
                    double letterOneSideTwo = Double.parseDouble(dataLetter[1]);
                    double letterTwoSideOne = Double.parseDouble(dataLetter[2]);
                    double letterTwoSideTwo = Double.parseDouble(dataLetter[3]);
                    letter.Calculate(letterOneSideOne, letterOneSideTwo, letterTwoSideOne, letterTwoSideTwo);
                    break;

                case "chess":
                    Chess chess = new Chess();
                    ReadInput readChess = new ReadInput();
                    readChess.setText("Enter chess board dimensions, divided by coma: ");
                    String[] dataChess = readChess.getParam().split(", ");
                    int height = Integer.parseInt(dataChess[0]);
                    int weight = Integer.parseInt(dataChess[1]);
                    chess.getGreed(height, weight);
                    break;

                default:
                    System.out.println("Not valid option");
                    break;
            }
            System.out.print("Do you want to continue? ");
            proceed = sc.next();
        }

        sc.close();

    }
}