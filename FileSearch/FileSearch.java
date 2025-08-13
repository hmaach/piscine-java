
import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        File root = new File("documents");
        if (!root.exists() || !root.isDirectory()) {
            return null;
        }
        return searchInDirectory(root, fileName, "documents");
    }

    private static String searchInDirectory(File dir, String fileName, String relativePath) {
        File[] files = dir.listFiles();
        if (files == null) {
            return null;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return relativePath + "/" + fileName;
            } else if (file.isDirectory()) {
                String foundPath = searchInDirectory(file, fileName, relativePath + "/" + file.getName());
                if (foundPath != null) {
                    return foundPath;
                }
            }
        }
        return null;
    }
}
