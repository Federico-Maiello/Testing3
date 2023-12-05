import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = offsetDateTime.format(formatter);

        System.out.println(formattedDate);
    }

    public static String format(DateTimeFormatter dateTimeFormatter, java.time.OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(dateTimeFormatter);
    }
}
