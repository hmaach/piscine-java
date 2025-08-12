
import java.io.*;

public class Cat {

    public static void cat(String[] args) throws IOException {
        for (String arg : args) {
            try (InputStream in = new FileInputStream(arg)) {
                byte[] buffer = new byte[8192];
                int bytesRead;

                while ((bytesRead = in.read(buffer)) != -1) {
                    System.out.write(buffer, 0, bytesRead);
                }
            }
        }
    }
}
