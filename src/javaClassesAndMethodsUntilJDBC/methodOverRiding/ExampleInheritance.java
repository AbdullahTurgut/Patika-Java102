package javaClassesAndMethodsUntilJDBC.methodOverRiding;

// Abstract ExampleClass sınıfından kalıtım alındı. Methodlar overriding edildi.
public  class ExampleInheritance extends ExampleClass{
    // aynı isime sahip fakat parametleri farklı methodlar aşırı yüklenme özelliğine sahip
    // parametre kullanmadan giris ve kullanarak çağırdığımızda ona göre methodu çağırmış oluruz
    @Override
    public void giris(){
        System.out.println("ilk method");
    }

    @Override
    public void giris(String str){
        System.out.println(str + " parametreli");
    }
    @Override
    public void giris(String name,int age){
        System.out.println(name + " 'ın yaşı : " + age);
    }
}
