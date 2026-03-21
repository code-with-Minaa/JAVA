package f_data_types;

import java.util.Scanner;
public class d_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 225 to grt a symbol:");
        int num = sc.nextInt();
        char letter = (char) num;
        System.out.println("The converted symbol is " + letter);
        sc.close();
    }
}
