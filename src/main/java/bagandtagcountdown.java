import java.util.Date;

public class bagandtagcountdown {

    public static void main(String[] args) {
        calculate();

    }
        public static String calculate() {
            final Date bagtag = new Date (119, 1, 19, 20, 59);
            final Date now = new Date();
            final int maxMonths = 12;
            final int maxHours = 24;
            final int maxMin = 60;
            final int maxSec = 60;

            if (now.getYear()< bagtag.getYear()) {

                Integer months = (11-now.getMonth())+ bagtag.getMonth();
                Integer days = (30-now.getDate() + bagtag.getDate());
                Integer hours = (24-now.getHours() + bagtag.getHours());
                if(hours >24) {
                    days++;
                    hours -= 24;
                }
                Integer minutes = (60-now.getMinutes() + bagtag.getMinutes());
                if (minutes > maxMin) {
                    hours++;
                    minutes-= maxMin;
                }
                Integer seconds = (60-now.getSeconds());
                if (seconds >maxSec) {
                    minutes++;
                    seconds-=maxSec;
                }
                if (months != 1) {
                    return (":alarm_clock: " + months + " months, " + days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds until Bag and Tag Day!");

                } else {
                    return (":alarm_clock: " + months + " month, " + days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds until Bag and Tag Day!");

                }

            }
            return " ";
        }
}
