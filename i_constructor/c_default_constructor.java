package i_constructor;

class Stud {
    int roll;
    String name;
    int age;

    Stud() {
        roll = 4;
        name = "Ram";
        age = 20;
    }

    public void displayDetails() {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class c_default_constructor {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.displayDetails();
    }
}
