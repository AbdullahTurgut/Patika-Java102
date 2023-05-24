package io.printStreams;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        try {
            PrintStream output = new PrintStream("src/io/printStreams/print.txt"); // verilen pathde dosya oluşturucak
            output.print(123123);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
