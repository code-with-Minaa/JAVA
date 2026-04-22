package za_file_io;

import java.io.File;
import java.io.IOException;

public class a_file_create {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\za_file_io\\mina.text");
        try {
            file.createNewFile();
            System.out.println("File Created Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
