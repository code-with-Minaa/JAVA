package d_Control_Statements.a_if;

import java.util.Scanner;
public class d_iff_else_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is odd or even");
        int num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("The number is even number  :" + num);
        } 
        else {
            System.out.println("The number is odd number : " + num );
        }
        sc.close();
    }  
}

