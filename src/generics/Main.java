package generics;

public class Main {
    public static void main(String[] args) {
        GenericNullable<Integer> n = new GenericNullable<>(10);
        n.run();

//        Integer a = null;
//        IntegerNullable integerNullable = new IntegerNullable(a);
//        integerNullable.run();
//        String str = "12312";
//        Nullable n = new Nullable(str);
//        n.run(); // isNull methodu false geldiği için string i bastırdı


    }
}
