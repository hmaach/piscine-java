
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
        LocalDate date = LocalDate.parse(stringDate, inputFormatter);

        return date;
    }

    public static LocalTime parseTimeFormat(String stringDate) {

        String[] parts = stringDate.split("\\D+");
        // System.err.println(Arrays.toString(parts));

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2]);

        if (stringDate.contains("du soir")) {
            hour += 12;
        } else if (stringDate.contains("du matin") && hour == 12) {
            hour = 0;
        }

        LocalTime time = LocalTime.of(hour, minute, second);

        return time;
    }

}
