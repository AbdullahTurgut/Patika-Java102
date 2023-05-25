package javaClassesAndMethodsUntilJDBC.generics;

public class HackerRankGenericQuestion {
    public static <T> void print(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3};
        String[] arrStr = {"Hello", "World"};

        print(arrInt);
        print(arrStr);
    }
}
