import java.util.ArrayList;
import java.util.Date;

public class upcomingDates {
    /*
    pseudocode:
    have each event be a date object
    put each event in a list
    have a method that runs through every event (for each loop) in the list and checks if it's b4 or after current date
    -and if current date is after the event then delete the event from the list
     */


    @Override
    public String toString() {
        Date ex = new Date();
        return ex.getMonth() + " " + ex.getDate() + " at " + ex.getHours() + ex.getMinutes();

    }
    public static String dates () {
        final Date now = new Date();
        final Date kickoff = new Date(119, 0, 5, 8, 0);
        final Date strat = new Date (119, 0, 8, 6, 30);
        final Date pdr = new Date (119, 0, 15, 6,0 );
        final Date cdr = new Date (119, 0, 29,6 ,0);
        final Date bagtag = new Date (119, 1, 19, 20, 59);

        return "**Upcoming Dates:** "
                + "\n" + "__Kickoff:__ " + kickoff.toString()
                + "\n" +"__Strat Meeting with IRS:__ " +  strat.toString()
                + "\n" +"__PDR:__ " + pdr.toString()
                + "\n" +"__CDR:__ " + cdr.toString()
                + "\n" +"__Bag and Tag Day:__ " + bagtag.toString();


    }


}



/*
ArrayList<Date> dates = new ArrayList<Date>;
    dates.add(kickoff,bagtag )
    for (Date thing: dates) {
        if (thing > now ) {
            dates.remove(thing);
        } else {
 */