package za_file_io;

import java.io.File;
import java.io.IOException;

public class b_file {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\za_file_io\\mina.text");
        if(!file.exists()){
            try {
            file.createNewFile();
            System.out.println("File Created Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }else {
        System.out.println("File already exists.");
    }
    }
}
