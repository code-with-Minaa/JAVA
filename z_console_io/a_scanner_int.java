package z_console_io;

import java.util.Scanner;

public class a_scanner_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The number is " +num);
        sc.close();
    }
}
