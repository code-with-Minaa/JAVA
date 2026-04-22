package za_file_io;

import java.io.FileReader;
import java.io.IOException;

public class e_file_read_filereader {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("D:\\JAVA\\za_file_io\\sajana.text");
        int a = 0;

        while((a = fr.read()) != -1) {
            System.out.println((char) a);
        }
        fr.close();
    }
}
