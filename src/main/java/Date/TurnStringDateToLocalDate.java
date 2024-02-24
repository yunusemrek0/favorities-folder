package Date;

import java.sql.Date;
import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TurnStringDateToLocalDate {

    private static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String dateTimeConverter(){

        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/New_York"));


        return dateTime.format(formatter);

    }

    public static LocalDate dateConverter(){
        String localDateTime = dateTimeConverter();

        return LocalDate.parse(localDateTime.substring(0,10));
    }

    public static LocalTime timeConverter(){
        String localDateTime = dateTimeConverter();

        return LocalTime.parse(localDateTime.substring(11));
    }


    public static void main(String[] args) {

        System.out.println(timeConverter());
    }


}
