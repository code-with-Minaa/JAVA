package i_constructor;

public class f_parameterized_constructor {
    int roll;
    String name;

    public f_parameterized_constructor(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        f_parameterized_constructor obj1 = new f_parameterized_constructor(1, "Deep");
        f_parameterized_constructor obj2 = new f_parameterized_constructor(2, "Dibya");
        obj1.display();
        obj2.display();
    }
}
