package org.example;

import java.util.Scanner;

import static java.lang.StrictMath.round;

public class Triangle {

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double square;


    public void TriangleCalculate() {
        String result = "";
        String exit;
        Scanner scan = new Scanner(System.in);
        do {
            ReadInput readTriangle = new ReadInput();
            readTriangle.setText("Please, enter information about first triangle - name, a_side_length, " +
                    "b_side_length, c_side_length: ");
            String[] data = readTriangle.getParam().split(", ");
            if (result.length() > 0) {
                result += "\r\n";
            }
           setName(data[0]);
            setSideA(Double.parseDouble(data[1]));
            setSideB(Double.parseDouble(data[2]));
            setSideC(Double.parseDouble(data[3]));
            double square = squareCalc(sideA, sideB, sideC);
            result += "[Triangle " + name + "]: " + square + " cm";
            if (square > 0) {
                System.out.println("Do you want to enter new triangle? (yes/no)");
            } else {
                System.out.println("Entered dimensions are not correct");
            } exit = scan.next();
        } while ("yes".equalsIgnoreCase(exit));
        displayResult(result);
    }

    public double squareCalc(double sideA, double sideB, double sideC) {
        double p = p(sideA, sideB, sideC);
        double sqrt = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return round(sqrt * 100) / 100.0;
    }

    private final double p(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC) / 2;
    }

    public void displayResult(String result) {
        System.out.println("============= Triangles list: ===============");
        System.out.println(result);
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void setName(String name) {
        this.name = name;
    }

}
