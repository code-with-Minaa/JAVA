//Call Parent Class Method

package q_super_class;

class Animall {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animall {
    void sound() {
        System.out.println("Cat meows");
    }

    void show() {
        super.sound();  // calls parent method
        sound();        // calls child method
    }
}

public class b_call_parent_class_method {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.show();
    }
}
