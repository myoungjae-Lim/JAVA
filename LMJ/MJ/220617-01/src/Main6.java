// 은행 계좌
// 필드: 잔고(int)
// 메소드: 입금(int) : void
//       출금(int) : void >> 출금액이 보유 잔고 이상일 때 예외(부족한 금액이 얼마?)를 발생시켜서 throws...
//       getter() : int

public class Main6 {
	public static void main(String[] args) {
		Bank b = new Bank(0);
		
		b.InMoney(1000);
		try {
			b.OutMoney(500);
			b.OutMoney(2000);
		} catch (OutMoneyOverException e) {
			System.out.println(e.getMessage());
		}
	}
}