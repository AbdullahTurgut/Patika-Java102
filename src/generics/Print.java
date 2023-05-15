package generics;

public class Print {
    //generic method
    public static <T> void printArray(T[] arr){
        for(T i : arr){
            System.out.println(i);
        }
    }
}
