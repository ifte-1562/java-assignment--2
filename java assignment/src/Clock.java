import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Clock {
    private String hours;
    private String minutes;
    private String time;

    LocalDateTime lt=LocalDateTime.now();
    public String getMinutes() {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("mm");

        this.minutes =dtf.format(lt.toLocalTime());
        return this.minutes;
    }

    public String getHours() {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("h");

       this.hours =dtf.format(lt.toLocalTime());
        return this.hours;
    }
    public String getTime() {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        this.time=dtf.format(lt.toLocalTime());
        return this.time;
    }
}
