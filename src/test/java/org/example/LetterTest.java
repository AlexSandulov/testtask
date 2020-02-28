package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LetterTest {

    @Test
    public void letterTest(){
        Letter calculate = new Letter();
        int testResult = calculate.result(1,1,2,2);
        assertEquals(testResult, 2, "First should be placed inside the Second");
    }

}