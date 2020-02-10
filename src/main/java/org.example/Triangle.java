package org.example;

import java.util.Scanner;

import static java.lang.StrictMath.round;

public class Triangle {
    public static void main(String[] args) {
        String result = "";
        String exit;
        do {
            System.out.print("Please, enter information about first triangle - name, a_side_" +
                    "length, b_side_length, c_side_length: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] data = input.split(", ");
            if (result.length() > 0) {
                result += "\r\n";
            }
            String name = data[0];
            double a = Double.parseDouble(data[1]);
            double b = Double.parseDouble(data[2]);
            double c = Double.parseDouble(data[3]);
            double square = squareCalc(a, b, c);
            result += "[Triangle " + name + "]: " + square + " cm";
            if (square > 0) {
                System.out.println("Do you want to enter new triangle? (yes/no)");
            } else {
                System.out.println("Entered dimensions are not correct");
            }
            exit = sc.next();
        } while (exit.equals("y") || exit.equals("yes"));
        displayResult(result);
    }

    public static double squareCalc(double a, double b, double c) {
        double p = p(a, b, c);
        double sqrt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return round(sqrt * 100) / 100.0;
    }

    private static final double p(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static void displayResult(String result) {
        System.out.println("============= Triangles list: ===============");
        System.out.println(result);
    }
}
