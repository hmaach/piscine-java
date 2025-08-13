package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content);
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        try {
            return Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            throw new IOException("Coudn't read the file content: ", e);
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
