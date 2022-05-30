class Time{
	private int time;
	private  int minute;
	private int second;
	
	public Time(int time, int minute, int second){
		this.time = time;
		this.minute = minute;
		this.second = second;
	}
	
	public int getTime(){
		return time;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
}

class AlarmClock{
	private Time currentTime;
	private Time alarmTime;
	
	public AlarmClock(Time currentTime, Time alarmTime){
		this.currentTime = currentTime;
		this.alarmTime = alarmTime;
	}
}

public class AlarmClockTest{
	public static void main(String args[]){
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		AlarmClock c = new AlarmClock(alarm, current);
		
		System.out.println(c);
	}
}