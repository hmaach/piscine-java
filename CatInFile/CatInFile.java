package CatInFile;

import java.io.*;

public class CatInFile {

    public static void cat(String[] args) throws IOException {
        for (String arg : args) {
            try (InputStream in = System.in; OutputStream out = new FileOutputStream(arg)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
        }
    }
}
