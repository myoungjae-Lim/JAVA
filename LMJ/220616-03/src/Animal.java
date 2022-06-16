
public class Animal implements EatMeat, Herbivore {
	private String species;
	private int age;
	private int weight;
	private int feed;

	public Animal(String type, int age, int weight, int feed) {
		this.species = type;
		this.age = age;
		this.weight = weight;
		this.feed = feed;		
	}
	
	public int getFeed() {
		return feed;
	}

	public void setFeed(int feed) {
		this.feed = feed;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String type) {
		this.species = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void eatHerbivore() {
		System.out.println(species);
	}

	@Override
	public void eatMeat() {
		System.out.println(species);
	}


}
