
public class CleanExtract {

    public static String extract(String s) {
        StringBuilder res = new StringBuilder();
        String[] parts = s.split("\\|");
        for (int partIdx = 0; partIdx < parts.length; partIdx++) {
            String part = parts[partIdx];
            String trimmedPart = part.trim();
            if (!trimmedPart.contains(".")) {
                if (trimmedPart.length() > 0) {
                    res.append(trimmedPart);
                    if (partIdx < parts.length - 1) {
                        res.append(' ');
                    }
                }
            } else if (countChar(trimmedPart, '.') == 1) {
                Boolean dot_found = false;
                StringBuilder cleaned_str = new StringBuilder();
                for (int i = 0; i < trimmedPart.length(); i++) {
                    if (trimmedPart.charAt(i) == '.') {
                        dot_found = true;
                        continue;
                    }
                    if (dot_found) {
                        cleaned_str.append(trimmedPart.charAt(i));
                    }
                }

                if (cleaned_str.length() > 0) {
                    res.append(cleaned_str.toString().trim());
                    if (partIdx < parts.length - 1) {
                        res.append(' ');
                    }
                }
            } else {
                int first_dot = 0;
                int last_dot = 0;
                StringBuilder cleaned_str = new StringBuilder();

                // start searching for the first dot
                for (int i = 0; i < trimmedPart.length(); i++) {
                    if (trimmedPart.charAt(i) == '.') {
                        first_dot = i;
                        break;
                    }
                }
                // start searching for the last dot
                for (int i = trimmedPart.length() - 1; i > 0; i++) {
                    if (trimmedPart.charAt(i) == '.') {
                        last_dot = i;
                        break;
                    }
                }

                // append the content between dots
                if (last_dot != first_dot) {
                    for (int i = first_dot + 1; i < last_dot; i++) {
                        cleaned_str.append(trimmedPart.charAt(i));
                    }
                }

                if (cleaned_str.length() > 0) {
                    res.append(cleaned_str.toString().trim());
                    if (partIdx < parts.length - 1) {
                        res.append(' ');
                    }
                }
            }
        }

        return res.toString().trim();
    }

    public static int countChar(String s, Character c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}

// The quick brown fox Jumps over the lazy dog.
// I love coding, Coding is fun .
