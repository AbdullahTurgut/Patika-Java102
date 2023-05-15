package generics;

public class Main {
    public static void main(String[] args) {
        String[] a = {"Java", "102", "Patika", "Dev"};
        Integer[] b = {1, 2, 3, 4};
        Character[] c = {'J', 'A', 'V', 'A'};

        Print.printArray(a);
        Print.printArray(b);

//        GenericNullable<Integer> n = new GenericNullable<>(10);
//        n.run();

//        Integer a = null;
//        IntegerNullable integerNullable = new IntegerNullable(a);
//        integerNullable.run();
//        String str = "12312";
//        Nullable n = new Nullable(str);
//        n.run(); // isNull methodu false geldiği için string i bastırdı


    }
}
