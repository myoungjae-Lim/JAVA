public class Car{
	private int speed;
	private int gear;
	private String color;
	
	public Car(String c, int s, int g){
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c){
		this(c, 0, 1);
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void setGear(){
		this.gear = gear;
	}
	
	public int getGear(int gear){
		return gear;
	}
}