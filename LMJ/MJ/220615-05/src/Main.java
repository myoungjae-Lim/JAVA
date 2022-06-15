
class Member implements Comparable<Member> {
	private String name;
	private int height;
	private int weight;
	
	public Member(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
	
}

public class Main{
	public static void main(String[] args) {
		Member[] members = {new Member("키큰놈", 190, 60), new Member("작은놈", 130, 30), new Member("중간놈", 176, 65)
		};
	}
}