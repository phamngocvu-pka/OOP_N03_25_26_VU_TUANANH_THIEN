import core.Time;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class TestTime {
    public static void main(String[] args) {
        Time now = new Time();
        long epoch = now.toEpochSeconds();
        Time from = Time.fromEpochSeconds(epoch, ZoneId.systemDefault());
        assert Math.abs(from.toEpochSeconds() - epoch) <= 1;

        long days = Time.diff(
            LocalDateTime.of(2025,1,1,0,0).atZone(ZoneId.systemDefault()),
            LocalDateTime.of(2025,1,10,0,0).atZone(ZoneId.systemDefault()),
            ChronoUnit.DAYS
        );
        assert days == 9; // từ 1->10 là 9 ngày theo between
        System.out.println("TestTime passed");
    }
}