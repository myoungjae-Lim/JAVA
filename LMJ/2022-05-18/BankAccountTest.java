class BankAccount {
	int balance;
	void deposit(int amount){
		balance += amount;
	}
	void withdraw(int amount){
		if(balance <= 0){
			System.out.println("인출할수 없습니다.");
		}
		else{
			balance -= amount;
	
		}
	}
	void addInterest(){
		balance += balance*0.075;
	}
	int getBalance() {
		return balance;
	}
}

public class BankAccountTest {
	public static void main(String args[]){
		int a;
		BankAccount bank = new BankAccount();
		
		bank.deposit(100);
		bank.withdraw(60);
		bank.withdraw(40);
		bank.withdraw(1);
		bank.addInterest();
		a = bank.getBalance();
		System.out.println("현재 잔고: " + a);
	}
}
