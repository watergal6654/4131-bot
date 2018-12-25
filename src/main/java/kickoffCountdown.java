/*import java.util.Date;

public class kickoffCountdown {
Date kickoff = new Date(2019, 1, 5, 8, 0);
Date now = new Date();

Integer month = kickoff.getMonth()- now.getMonth();

}
*/
import java.util.Date;
/*
totally hypothetical idea, but command "timeUntil" or something and then have user put in an event, and this class can use
that as a parameter and go through the upcoming dates list to return time until the event
 */
public class kickoffCountdown {

    public static void main(String[] args) {
        calculate();

    }
    public static String calculate() {
        final Date kickoff = new Date(119, 0, 5, 8, 0);
        final Date now = new Date();
        final int maxMonths = 12;
        final int maxHours = 24;
        final int maxMin = 60;
        final int maxSec = 60;

        if (now.getYear()< kickoff.getYear()) {

            Integer months = (11-now.getMonth())+ kickoff.getMonth();
            Integer days = (30-now.getDate() + kickoff.getDate());
            Integer hours = (24-now.getHours() + kickoff.getHours());
            if(hours >24) {
                days++;
                hours -= 24;
            }
            Integer minutes = (60-now.getMinutes() + kickoff.getMinutes());
            Integer seconds = (60-now.getSeconds());
            return (":alarm_clock: " + months + " months, " + days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds until the 2019 FRC Deep Space Kickoff!!");
        }
        return " ";
    }
    /*

      pseudocode:analyzes if year projected is next or current one, then same for month, day, hour and minute

      scenarios for year:
      -if year is less than projected date but not enough months to qualify as a whole year
      -if year is equal to projected year so need to run through all other commands but set year as 0
      -if year is more than projected date, return error
      -if year is less AND more than 12 months in till projected

      scenarios for month:
      -if month has 31 or 30 days
      -if february has 28 or 29 days
      -if month same as projected




*/


}

