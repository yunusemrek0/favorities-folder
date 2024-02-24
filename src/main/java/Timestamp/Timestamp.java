package Timestamp;

public class Timestamp {




    public static void main(String[] args) {

        java.sql.Timestamp timestamp =new java.sql.Timestamp( System.currentTimeMillis());
        System.out.println("timestamp.getTime() = " + timestamp.getTime());
        System.out.println("timestamp.toLocalDateTime().toLocalTime() = " + timestamp.toLocalDateTime().toLocalTime());
        System.out.println("timestamp.toLocalDateTime() = " + timestamp.toLocalDateTime());
        System.out.println("timestamp = " + timestamp);
    }
}
