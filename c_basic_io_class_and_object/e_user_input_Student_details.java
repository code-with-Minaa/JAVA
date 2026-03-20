package c_basic_io_class_and_object;

import java.util.Scanner;
class Studentt {
    int roll;
    String name, address;
    void getData(Scanner sc)
    {
        roll = sc.nextInt();
        name = sc.next();
        address = sc.next();
    }
    void displayData()
    {
        System.out.println("\nRoll number = " + roll);
        System.out.println("\nName = " + roll);
        System.out.println("\nKathmandu = " + roll);
    }
}
public class e_user_input_Student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of Student 1:");
        Studentt s1 = new Studentt();
        s1.getData(sc);

        System.out.println("Enter the details of Student 2:");
        Studentt s2 = new Studentt();
        s2.getData(sc);

        System.out.println("Enter the details of Student 3:");
        Studentt s3 = new Studentt();
        s3.getData(sc);
        s1.displayData();
        s2.displayData();
        s3.displayData();
    }
}
