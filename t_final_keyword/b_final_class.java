package t_final_keyword;

// final class SuperClass {
final class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
public class b_final_class {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.sound();
    }
}