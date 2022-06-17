
public class Bank {
	private int money;	
		
	public Bank(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void InMoney(int m) {
		money += m;
		System.out.println("현재 잔고:" + money);
	}	
	
	public void OutMoney(int m) throws OutMoneyOverException {
		if(m > money) {
			throw new OutMoneyOverException("통장에 잔고가 " + (m - money) + "원 부족해 출금 할수 없습니다."); 
		}
		else {
			money -= m;
			System.out.println("현재 잔고:" + money);
		}
	}
	
	
}
