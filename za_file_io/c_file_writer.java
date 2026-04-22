package za_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class c_file_writer {
    public static void main(String[] args) throws IOException {
        String str = "Hello Guys......";
        FileWriter fw = new FileWriter("D:\\JAVA\\za_file_io\\sajana.text");

        for(int i = 0; i < str.length(); i++){
            fw.write(str.charAt(i));
        }
        System.out.println("Data updated successfully.");
        fw.close();
    }
}
