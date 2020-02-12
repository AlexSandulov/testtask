package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String option;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, User! Please make a choice, you can start program Triangle, " +
                "Letter or Chess. Type the full program name: ");
        option = sc.nextLine();

        if ("triangle".equals(option.toLowerCase())) {
            // call triangle
        } else if ("letter".equals(option.toLowerCase())){
            //call letter
        } else if ("chess".equals(option.toLowerCase())){
            Chess chess = new Chess();
            sc = new Scanner(System.in);
            System.out.print("Please enter board height (x): ");
            int x = sc.nextInt();
            chess.setX(x);
            sc = new Scanner(System.in);
            System.out.print("Please enter board width (y): ");
            int y = sc.nextInt();
            chess.setY(y);
            chess.greedBuild();
        } else {
            System.out.println("Not valid option, bye");
        }
        sc.close();
    }
}
