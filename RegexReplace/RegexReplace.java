
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {

    public static String removeUnits(String s) {

        Pattern pattern = Pattern.compile("(?<=\\d+)(cm|€)((?=\\b(?!²))|(?=\\s*$))");
        Matcher matcher = pattern.matcher(s);

        return matcher.replaceAll("");
    }

    public static String obfuscateEmail(String s) {
        StringBuilder res = new StringBuilder("");

        String[] parts = s.split("@");
        if (parts.length == 2) {

            if (parts[0].contains(".") || parts[0].contains("-") || parts[0].contains("_")) {
                int pointIdx = parts[0].indexOf('.');
                int dashIdx = parts[0].indexOf('-');
                int underSIdx = parts[0].indexOf('_');

                int minIdx = Integer.MAX_VALUE;

                if (pointIdx != -1) minIdx = Math.min(minIdx, pointIdx);
                if (dashIdx != -1) minIdx = Math.min(minIdx, dashIdx);
                if (underSIdx != -1) minIdx = Math.min(minIdx, underSIdx);

                res.append(parts[0].substring(0, minIdx + 1));
                res.append(String.valueOf('*').repeat(parts[0].substring(minIdx + 1).length()));

            } else if (parts[0].length() > 3) {
                res.append(parts[0].substring(0, 3));
                res.append(String.valueOf('*').repeat(parts[0].substring(3).length()));
            } else {
                res.append(parts[0]);
            }

            res.append("@");

            // handle domains
            String[] domains = parts[1].split("\\.");
            if (domains.length >= 2) {
                res.append(String.valueOf('*').repeat(domains[0].length()));
                res.append('.');
                if (domains.length == 2) {
                    if (domains[1].equals("com") || domains[1].equals("org") || domains[1].equals("net")) {
                        res.append(domains[1]);
                    } else {
                        res.append(String.valueOf('*').repeat(domains[1].length()));
                    }
                } else if (domains.length == 3) {
                    res.append(domains[1]);
                    res.append('.');
                    if (domains[2].equals("com") || domains[2].equals("org") || domains[2].equals("net")) {
                        res.append(domains[2]);
                    } else {
                        res.append(String.valueOf('*').repeat(domains[2].length()));
                    }
                }
            }

        }
        return res.toString();
    }
}
