package org.example;

public class Chess {

    private int height;
    private int weight;

    public void greedBuild (int height, int weight){
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.weight; j++)
                if ((i + j) % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }

}
