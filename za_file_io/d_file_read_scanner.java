package za_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d_file_read_scanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\JAVA\\za_file_io\\sajana.text");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
