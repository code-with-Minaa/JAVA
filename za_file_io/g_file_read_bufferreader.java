package za_file_io;

import java.io.*;

public class g_file_read_bufferreader {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA\\za_file_io\\sajana.text");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
        br.close();
    }
}
