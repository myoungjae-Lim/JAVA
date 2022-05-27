class Car{
	
	String color;
	int speed;
	int gear;
	void print(){
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
	}
}

public class CarTest{
	public static void main(String[] args){
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		Car blueCar = new Car();
		blueCar.color = "blue";
		blueCar.speed = 60;
		blueCar.gear = 3;
		blueCar.print();
	}
}