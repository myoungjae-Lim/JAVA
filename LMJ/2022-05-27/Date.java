public class Date{
	int years;
	int month;
	int days;
	

	public void slashPrint(){
		System.out.printf("%02d/%02d/%d\n", month, days, years);
		
	}
	public void barPrint(){
		System.out.printf("%d-%02d-%02d\n", years, month, days);
	}
}