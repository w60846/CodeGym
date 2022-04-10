package pl.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Klasa ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader =  new BufferedReader( new InputStreamReader(System.in));

        return reader.readLine();

    }

    public static int readInt() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader =  new BufferedReader( new InputStreamReader(System.in));

        return Integer.parseInt(reader.readLine());

    }

    public static double readDouble() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader =  new BufferedReader( new InputStreamReader(System.in));

        return Double.parseDouble(reader.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader =  new BufferedReader( new InputStreamReader(System.in));

        return Boolean.parseBoolean(reader.readLine());

    }

    public static void main(String[] args) {

    }
}
