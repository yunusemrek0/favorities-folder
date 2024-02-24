package Date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class DateTimeFormat {



    public static void main(String[] args) {
        //System.out.println(new DateTimeFormat().dateFormat());
        //System.out.println(dateFormat3());
        //System.out.println(dateTimeConverter());
        System.out.println(dateTimeConverter());

    }

    private static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMddHHmmssmsms");


    public static String dateTimeConverter(){

        LocalDateTime dateTime = LocalDateTime.now();


        return dateTime.format(formatter);
    }

    public static LocalDate dateConverter(String date){

        return LocalDate.parse(date.substring(0,10));
    }

    public static LocalTime timeConverter(String date){

        String localDateTime = dateTimeConverter();

        return LocalTime.parse(localDateTime.substring(11));
    }



}
