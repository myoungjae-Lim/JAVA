
public interface Flyable { // 인터페이스는 추상적인 메소드 만을 가질수있다.
	void fly();  // 인터 페이스에서는 접근제한자 ,abstract 생략가능  무조건 public으로 생성  
}

class Animal {}
class Bird extends Animal {}
class Eagle extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득 납니다.");
		
	}}
class Penguin extends Bird {}
class FlyingFish implements Flyable{

	@Override
	public void fly() {
		System.out.println("날치가 물위로 남");
	}
	
}