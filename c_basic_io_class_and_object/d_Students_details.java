package c_basic_io_class_and_object;

class Stud{
    int roll, age;
    String name, address;
    void inputDetails( int r, int a, String n, String add){
        roll = r;
        age = a;
        name = n;
        address = add;
    }

    void displayDetails(){
        System.out.println("\nRoll number = " + roll);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }

}
public class d_Students_details {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        Stud s2 = new Stud();
        s1.inputDetails(6, 10, "Deep", "Kathmandu");
        s2.inputDetails(17, 7, "Dibya", "Kathmandu");
        s1.displayDetails();
        s2.displayDetails();
    }
}
