package c_basic_io_class_and_object;
class Student{
    int roll = 32;
    String name = "Mina Karki";
}

public class c_class_outside_main_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll number = " + s1.roll);
        System.out.println("Name = " + s1.name);
    }
}
