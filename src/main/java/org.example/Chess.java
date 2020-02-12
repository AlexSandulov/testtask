package org.example;

public class Chess {

    private int x;
    private int y;

    public void greedBuild (){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                if ((i + j) % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
