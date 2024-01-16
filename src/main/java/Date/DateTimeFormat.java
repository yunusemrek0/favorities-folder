package Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

    private static String dateFormat(){

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return localDateTime.format(formatter);

    }

    public static void main(String[] args) {
        System.out.println(dateFormat());
    }
}
