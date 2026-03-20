package b_basic_io;

import java.util.Scanner;
public class e_add_two_user_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " = " + sum);
        sc.close();
    }
    
}
