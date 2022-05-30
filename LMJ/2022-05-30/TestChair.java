// 의자 클래스 
// 제조자 
// 생산일자
// 가격
// 모델명

// 최기화 할수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화
                                                                                                         
class Chair{
	String producter;
	String date;
	int price;
	String name;
	
	public Chair(String producter, String date, int price, String name){
		this.producter = producter;
		this.date = date;
		this.price = price;
		this.name = name;
	}
	
}

public class TestChair{
	public static void main(String args[]){
		Chair chair = new Chair("제조사", "생산일자", 5000, "모델명");
		
		System.out.println(chair.producter + chair.date + chair.price + chair.name);
	}
}
