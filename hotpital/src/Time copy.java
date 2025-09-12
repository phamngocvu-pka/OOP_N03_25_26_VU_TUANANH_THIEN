package core;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Tiện ích thời gian cho tuần 3: khởi tạo, dọn dẹp/GC không áp dụng trực tiếp,
 * nhưng class này minh họa tạo đối tượng (constructor) & phương thức static.
 */
public class Time {
    private final ZonedDateTime value;

    // Khởi tạo mặc định = now theo hệ thống
    public Time() {
        this.value = ZonedDateTime.now();
    }

    // Khởi tạo từ chuỗi (ISO như 2025-05-31T10:15:30+07:00[Asia/Bangkok])
    public Time(String isoZoned) {
        this.value = ZonedDateTime.parse(isoZoned);
    }

    // Khởi tạo từ LocalDateTime + ZoneId
    public Time(LocalDateTime ldt, ZoneId zone) {
        this.value = ldt.atZone(zone);
    }

    public ZonedDateTime getValue() { return value; }

    // Định dạng ra chuỗi theo pattern
    public String format(String pattern) {
        return value.format(DateTimeFormatter.ofPattern(pattern));
    }

    // Cộng trừ thời gian
    public Time plusDays(long days) { return new Time(value.plusDays(days).toString()); }
    public Time minusDays(long days) { return new Time(value.minusDays(days).toString()); }

    // Hiệu 2 mốc thời gian theo đơn vị
    public static long diff(ZonedDateTime a, ZonedDateTime b, ChronoUnit unit) {
        return unit.between(a, b);
    }

    // Chuyển đổi sang epoch seconds
    public long toEpochSeconds() { return value.toEpochSecond(); }

    // Tạo Time từ epoch seconds
    public static Time fromEpochSeconds(long epochSeconds, ZoneId zone) {
        return new Time(Instant.ofEpochSecond(epochSeconds).atZone(zone).toString());
    }
}