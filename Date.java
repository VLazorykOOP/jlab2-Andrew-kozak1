package lab;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Year;
import java.time.Period;
public class Date {
    private int year;
    private byte month;
    private byte day;

    public Date(int year, byte month, byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(String date) {
        String[] parts = date.split("\\.");
        this.year = Integer.parseInt(parts[0]);
        this.month = Byte.parseByte(parts[1]);
        this.day = Byte.parseByte(parts[2]);
    }

    public Date(Date other) {
        this.year = other.year;
        this.month = other.month;
        this.day = other.day;
    }

    public void addDays(int days) {
        LocalDate date = LocalDate.of(year, month, day).plusDays(days);
        this.year = date.getYear();
        this.month = (byte) date.getMonthValue();
        this.day = (byte) date.getDayOfMonth();
    }

    public void subtractDays(int days) {
        LocalDate date = LocalDate.of(year, month, day).minusDays(days);
        this.year = date.getYear();
        this.month = (byte) date.getMonthValue();
        this.day = (byte) date.getDayOfMonth();
    }

    public boolean isLeapYear() {
        return Year.of(year).isLeap();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public int compare(Date other) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(other.year, other.month, other.day);
        return date1.compareTo(date2);
    }

    public int daysBetween(Date other) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(other.year, other.month, other.day);
        return Math.abs(Period.between(date1, date2).getDays());
    }
    public String toString(){
        return year + "." + month + "." + day;
    }
}
