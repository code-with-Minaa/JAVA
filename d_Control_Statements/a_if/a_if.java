package d_Control_Statements.a_if;

import java.util.Scanner;
public class a_if {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number to check positive:");
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("The  number " + a + " 3is a positive number");
        }
        sc.close();
    }
}
