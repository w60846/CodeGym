package pl.codegym.task.task19.task1913;

/* 
Wyświetlaj tylko cyfry
*/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream copy = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStream));

        testString.printSomething();

        System.setOut(copy);

        String result = outputStream.toString().replaceAll("\\D","");

        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
