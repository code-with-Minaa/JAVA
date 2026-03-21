package e_operators;

import java.lang.Math;
import java.util.Scanner;
public class a_arithmeticc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        sc.close();
        System.out.println("The sum = " + (a+b));
        System.out.println("The difference = " + (a-b));
        System.out.println("The product = " + (a*b));
        System.out.println("The quotient = " + (a/b));
        System.out.println("The remainder = " + (a%b));
        System.out.println("The Exponential = " + (int)Math.pow(a,b));
    }
}
