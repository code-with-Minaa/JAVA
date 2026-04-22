package za_file_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k_file_character_stream {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA\\za_file_io\\mina.text");
        FileReader reader = new FileReader(file);
        char chars[] = new char[(int) file.length()];
        reader.read(chars);
        File out = new File("D:\\JAVA\\za_file_io\\copy_ofmina.text");
        try (FileWriter writer = new FileWriter(out)) {
            writer.write(chars);
            writer.flush();
        }
        System.out.println("Data has been written successfully.");
        reader.close();
    }
}
