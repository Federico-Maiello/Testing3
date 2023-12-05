import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class MainTest {
    String dateString = "2002-03-01T13:00:00Z";
    java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);
    private Assertions Assert;

    @Test
    void format() {
        String risultato = Main.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL), offsetDateTime);
        Assert.assertEquals("venerdì 1 marzo 2002", risultato);
    }

}