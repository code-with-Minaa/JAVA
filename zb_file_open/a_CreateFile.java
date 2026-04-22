package zb_file_open;
import java.io.File;        // Import File class
import java.io.IOException; // Import IOException class

public class a_CreateFile {
    public static void main(String[] args) {
        try {
            // Create a file object
            File file = new File("test.txt");

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}