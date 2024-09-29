import java.io.File;
/*
 * 1. File I/O in Java
 *
 * Java provides useful classes for reading and writing files. The most common are:
 *     - File: represents a file or directory in the file system.
 *     - FileReader: used to read data from a text file (characters).
 *     - FileWriter: used to write data to a text file (characters).
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("This is an example of writing to a file.");
            System.out.println("Writing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Key Features of This Code:
//
//    File Writing:
//        The FileWriter class creates a new file (example.txt) and writes a string into it.
//        The try-with-resources statement ensures that the FileWriter is closed automatically after the operation.
//
//    File Reading:
//        The FileReader class reads the content of the file character by character.
//        Again, the try-with-resources statement ensures proper resource management.
//
//    Error Handling:
//        IOException is caught and handled, which is essential for I/O operations to manage potential errors gracefully.