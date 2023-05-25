package javaClassesAndMethodsUntilJDBC.generics;

public class IntegerNullable {

    private final Integer value;

    public IntegerNullable(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull())
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        else
            System.out.println(this.getValue());
    }
}
