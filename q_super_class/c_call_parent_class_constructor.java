//Call Parent Class Constructor
package q_super_class;

class animal {
    animal() {
        System.out.println("Animal constructor called");
    }
}

class Tiger extends animal {
    Tiger() {
        super();  // calls parent constructor
        System.out.println("Tiger constructor called");
    }
}

public class c_call_parent_class_constructor {
    public static void main(String[] args) {
        Tiger t = new Tiger();
    }
}
