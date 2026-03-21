package i_constructor;

class Employee {
    int eid;

    public Employee(int a) {
        eid = a;
        System.out.println("Employee id = " + eid);
    }
}

public class d_paremeterized_constructor {
    public static void main(String[] args) {
        new Employee(23);
    }
}
