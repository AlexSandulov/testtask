package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String option;
        String proceed = "Yes";

        while (proceed == "Yes") {
            Scanner sc = new Scanner(System.in);
            System.out.print("Hello, User! Please make a choice, you can start program Triangle, " +
                    "Letter or Chess. Type the full program name: ");
            option = sc.next();
            sc.close();
            switch (option.toLowerCase()) {
                case "triangle":
                    //call triangle
                    break;

                case "letter":
                    //call letter
                    break;

                case "chess":
                    Chess chess = new Chess();
                    ReadInput readInput = new ReadInput();
                    readInput.setText("Enter chess board dimensions, divided by coma: ");
                    String[] data = readInput.getParam().split(", ");
                    int height = Integer.parseInt(data[0]);
                    int weight = Integer.parseInt(data[1]);
                    chess.greedBuild(height, weight);
                    break;

                default:
                    System.out.println("Not valid option");
                    break;
            }

            proceed = "Yes";
        }
    }
}