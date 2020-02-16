package org.example;

import java.util.Scanner;

public class ReadInput {

    private String param;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getParam() {
        Scanner sci = new Scanner(System.in);
        System.out.println(text);
        this.param = sci.nextLine();
        sci.close();
        return param;
    }
}
