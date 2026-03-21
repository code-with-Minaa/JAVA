package d_Control_Statements.a_if;

import java.util.Scanner;
public class c_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere a number to check whether it is +ve or -ve number :");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number " + num + " is a +ve number.");
        } else {
            System.out.println("The number " + num + " is a -ve number");
        }
        sc.close();
    }
}
