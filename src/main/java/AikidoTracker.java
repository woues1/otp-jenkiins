import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AikidoTracker {
    private Date date;
    private String name;
    private int sessions;
    private Calendar calendar;
    private Map session = new HashMap<String, Integer>();


    public AikidoTracker(String name){
        this.date = Calendar.getInstance().getTime();
        this.calendar = Calendar.getInstance();
        this.name = name;
        this.sessions = 0;
    }

    public boolean isEligibleForKyu(){
        // 6 months and 100 sessions or 100 sessions
        if(this.date.compareTo(Calendar.getInstance().getTime()) > 6){
            return true;
        }
        if(this.sessions > 100){
            return true;
        }
        return false;
    }

    public void addSession(String date, String time){
        this.session.put(date, time);
        this.sessions++;
    }

    public void advanceDate(int months){
        this.calendar.add(Calendar.MONTH, months);
    }
    public int getTotalTime(){
        int total = 0;
        for(Object time : this.session.values()){
            total += (int)time;
        }
        return total;

    }
}
