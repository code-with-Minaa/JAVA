package i_constructor;

public class e_parameterized_constructor {
    public e_parameterized_constructor() {
        System.out.println("Default constructor is invoked");
    }
    public e_parameterized_constructor(int a) {
        System.out.println("Parameterized constructor is invoked with an integer value.");
    }
    public e_parameterized_constructor(int a, int b) {
        System.out.println("Parameterized constructor is invoked with two integer values.");
    } 
    public e_parameterized_constructor(int a, String b) {
        System.out.println("Parameterized constructor is invoked with an integer value and a string value.");
    }
    public static void main(String[] args) {
        
        new e_parameterized_constructor();
        new e_parameterized_constructor(11);
        new e_parameterized_constructor(11, 34);
        new e_parameterized_constructor(12, "MINA");
    }
}
 