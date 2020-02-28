package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GreetingsMessage {

    @Test
    public void testGreetings() {
        Greetings greetings = new Greetings();
        greetings.greetings("Hello, User! Please make a choice, you can start program Triangle, \\\" +\\n\" +\n" +
                "                \"                    \\\"Letter or Chess. Type the full program name: ");
        assertEquals(greetings.getText(),"Hello1, User! Please make a choice, you can start program Triangle, \" +\n" +
                "                    \"Letter or Chess. Type the full program name: ");
    }
}