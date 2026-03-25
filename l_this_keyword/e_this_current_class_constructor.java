// use of this keyword for constructor call
package l_this_keyword;

class Stud {
    int roll;
    String name, course;
    float marks;

    Stud(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }
    Stud(int roll, String name, String course, float marks) {
        this(roll, name, course);   // resuse of constructor using this keyword
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
        System.out.println("Marks = " + marks);
    }
}

public class e_this_current_class_constructor {
    public static void main(String[] args) {
        Stud s1 = new Stud(1, "Dibya Basnet", "BCA", 89.5f);
        Stud s2 = new Stud(2, "Deep Basnet", "BBA", 78.9f);
        s1.displayDetails();
        s2.displayDetails();
    }
}