
public class StringContains {

    public static boolean isStringContainedIn(String subString, String s) {
        if (s == null) s = "";
        if (subString == null) subString = "";

        return s.contains(subString);
    }
}
