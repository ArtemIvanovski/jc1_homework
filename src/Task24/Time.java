package Task24;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public boolean equals(Time time){
        if (this.hours==hours && this.minutes==minutes && this.seconds==seconds)
            return true;
            else
                return false;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
    public int getOnlySeconds(){
        return seconds+hours*3600+minutes*60;
    }
}
