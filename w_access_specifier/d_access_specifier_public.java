package w_access_specifier;

class MyClass{
    public int a = 100;
}
public class d_access_specifier_public {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("The value = " + obj.a);
    }
}