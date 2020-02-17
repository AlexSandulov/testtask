package org.example;

public class Chess {

    private int height;
    private int weight;

    public void getGreed(int height, int weight) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++)
                if ((i + j) % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }

    public Chess() {
        this.height = height;
        this.weight = weight;
    }
}
