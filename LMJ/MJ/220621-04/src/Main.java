import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LeafletHandler h1 = new UsuryAD("010-1234-5678");
		System.out.println(h1.give());
		
		LeafletHandler h2 = new VoteAD(LocalDate.of(2022, 06, 21));
		System.out.println(h2.give());
		
		ADAgency p = new ADAgency(h1);
		p.consoleAD();
		p.setAd(h2);
		p.consoleAD();
		
		
//		LeafletHandler h2 = new 선거광고();
//		String 선거 날짜가 포함된 광고 문자열 = h2.give();
//		
//		광고 대행사 p = new 광고대행사(일수 광고);
//		p.광고()
//		
//		p.set고객(선거광고);
//		p.광고() <<< 선거광고;
	}
}
