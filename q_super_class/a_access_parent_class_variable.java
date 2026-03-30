//Access Parent Class Variable

package q_super_class;

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void displayColor() {
        System.out.println(color);        // child class variable
        System.out.println(super.color);  // parent class variable
    }
}

public class a_access_parent_class_variable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();
    }
}

