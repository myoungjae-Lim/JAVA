class Can{
	private String name;
	
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class Main2 {
	public final static int COLA = 1;
	public final static int SPRITE = 2;
	public final static int FANTA = 3;
	
	public static Can returnCan(int can) {
		switch(can) {
			case COLA:				
				return new Can("콜라");				
			case SPRITE:				
				return new Can("사이다");
			case FANTA:				
				return new Can("환타");
			default:				
				return new Can("");
		}	
	}
	
	public static Can returnCan(String can) {
		switch(can) {
			case "COLA":				
				return new Can("콜라");				
			case "SPRITE":				
				return new Can("사이다");
			case "FANTA":				
				return new Can("환타");
			default:				
				return new Can("");
		}	
	}
	
	public static void main(String[] args) {
		System.out.println(returnCan(SPRITE));
		System.out.println(returnCan("COLA"));
	}
}
