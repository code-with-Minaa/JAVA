package e_operators;

import java.util.Scanner;
public class d_logical_AND_greatest_amont_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();
        sc.close();
        if (a>b && a>c)
        {
            System.out.println("a is greater than b and c");
        }
        else if (b>a && b>c ) 
        {
            System.out.println("b is greater than a and c");
        }
        else
        {
            System.out.println("c is greater than a and b");
        }
    }
}
