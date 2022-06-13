
public class Graduate extends Student {
	private String assistantType;
	private double scholarship;
	
	public Graduate(String name, int number, String major, int grade, int score, String assistantType,
			double scholarship) {
		super(name, number, major, grade, score);
		this.assistantType = assistantType;
		this.scholarship = scholarship;
	}

	public String getAssistantType() {
		return assistantType;
	}

	public void setAssistantType(String assistantType) {
		this.assistantType = assistantType;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n조교 유형:" + assistantType + "\n장학금:" + scholarship * 100 + "%";
	}
	
}
