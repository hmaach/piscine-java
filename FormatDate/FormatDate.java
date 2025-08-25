
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM", Locale.FRANCE);

        int year = dateTime.getYear();
        String month = dateTime.format(formatter);
        int day = dateTime.getDayOfMonth();
        int hours = dateTime.getHour();
        int minutes = dateTime.getMinute();
        int seconds = dateTime.getSecond();

        // Le 22 août de l'an 2021 à 13h25m et 46s
        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", day, month, year, hours, minutes, seconds);

    }

    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", Locale.ITALIAN);
        String month = date.format(formatter);

        int day = date.getDayOfMonth();
        String year = String.valueOf(date.getYear());

        return String.format("%s %d %s", month, day, year.substring(2));
    }

    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null;
        }
        return time.toString();
    }

}
