package javaClassesAndMethodsUntilJDBC.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int y = in.nextInt();
            int z = in.nextInt();
            int r = y / z;
            System.out.print(r);
        } catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.print(e);
        }


    }
}
