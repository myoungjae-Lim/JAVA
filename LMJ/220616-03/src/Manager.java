import java.util.Arrays;

public class Manager {
	private String manager;
	private Animal[] animals = new Animal[1];

	public Manager(String manager) {
		this.manager = manager;
	}

	public void getAnimal(Animal animal) {
		animals = Arrays.copyOf(animals, animals.length + 1);
		animals[animals.length - 1] = animal;
	}

	public void printAnimals() {

		System.out.println(manager + "가 관리하는 동물");

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i].getSpecies());
			}
		}
		System.out.println();
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
}
