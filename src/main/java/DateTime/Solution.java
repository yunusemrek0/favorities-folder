package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    public static void main(String[] args) {

        String stringDateTime = String.valueOf(LocalDateTime.now());
        String stringDateTimeToSave = stringDateTime.substring(0,10)+" "+ stringDateTime.substring(11,16);


        System.out.println("stringDateTime = " + stringDateTime);
        System.out.println("stringDateTimeToSave = " + stringDateTimeToSave);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(stringDateTimeToSave,formatter);

        System.out.println("localDateTime = " + localDateTime);
    }
}
