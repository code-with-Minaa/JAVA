package f_data_types;

import java.util.Scanner;
public class c_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word");
        char letter = sc.next().charAt(2);
        //char letter = sc.next().charAt(2); for apple : p
        System.out.println("The first letter is " + letter);
        System.out.println("ACSII value for letter" + letter + " is " +(int)letter);
        /* char letter = 'a';
        int ascii_num = letter;
        System.out.println("The ascii value for letter " + letter + " is " + ascii_num); */
        sc.close();
    }
}
