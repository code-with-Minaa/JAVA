package za_file_io;

import java.io.*;

public class f_file {
    public static void main(String[] args)throws IOException {
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\JAVA\\za_file_io\\sajana.text");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found." + fe);
        }
          while((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }
}
