
import java.io.*;
import java.util.Scanner;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IOException("invalid number of args");
        }

        File file = new File(args[0] + ".txt");
        try (Scanner in = new Scanner(file); OutputStream out = new FileOutputStream(args[1] + ".txt")) {
            while (in.hasNext()) {
                String word = in.next();

                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1);
                String capitalized = firstLetter + restOfWord;

                out.write(capitalized.getBytes());

                if (in.hasNext()) {
                    out.write(" ".getBytes());
                }
            }
        }
    }
}
