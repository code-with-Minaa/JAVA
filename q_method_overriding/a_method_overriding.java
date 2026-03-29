package q_method_overriding;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class a_method_overriding {
    public static void main(String[] args) {
        Animal obj = new Dog();  // Upcasting
        obj.sound();  // Calls Dog's method
    }
}