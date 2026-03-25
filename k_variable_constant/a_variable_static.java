package k_variable_constant;

class Student {
    static int college_id = 3;
    int roll;
    String name;

    public void inputDetails(int r, String n) {
        roll = r;
        name = n;
    }

    public void displayDetails() {
        System.out.println("College ID = " + college_id);
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
}

public class a_variable_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails(1, "Dibya Basnet");
        s1.displayDetails();

        Student s2 = new Student();
        s2.inputDetails(2, "Deep Basnet");
        s2.displayDetails();
    }
}
