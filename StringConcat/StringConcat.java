
public class StringConcat {

    public static String concat(String s1, String s2) {
        if (s1 == null) {
            return s2;
        } else if (s2 == null) {
            return s1;
        } else {
            return s1.concat(s2);
        }
    }
}
