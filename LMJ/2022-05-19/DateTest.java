class Date{
	int year;
	int month;
	String m;
	int day; 
	void print1(){
		System.out.println(year + "." + month + "." + day); 
	}
	
	void print2(){
		System.out.println(m + " " + day + "," + year);
	}
	
}

public class DateTest{
	public static void main(String args[]){
		Date days = new Date();
		days.year = 2012;
		days.month = 7;
		days.m = "July";
		days.day = 12;
		
		days.print1();
		days.print2();
	}
}