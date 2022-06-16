import java.util.Arrays;
import java.util.Scanner;

// 동물원 관리

// 동물 - 종, 나이, 무게 

// 관리하는 동물은 육식/초식으로 나누어서 관리
// 주식으로 분류하여 동물 목록을 볼 수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당이 없는 동물도 볼 수 있어야 함)

public class Zoo {
	private Animal[] animal = { new Animal("호랑이", 3, 40, 1), new Animal("사자", 1, 10, 1), new Animal("토끼", 2, 10, -1),
			new Animal("기린", 3, 50, -1), new Animal("표범", 2, 40, 1) };
	private EatMeat[] m = new EatMeat[animal.length];
	private Herbivore[] h = new Herbivore[animal.length];
	private Manager[] manager = { new Manager("홍길동씨"), new Manager("간디씨") };
	private Animal[] animals = Arrays.copyOf(animal, animal.length);

	public void managerClassification(Manager manager, Animal animal) {
		manager.getAnimal(animal);
	}

	public void managerAddAnimal() {
		for (int i = 0; i < animal.length; i++) {
			if (i % 2 == 0) {
				managerClassification(manager[0], animal[i]);
				animals[i] = null;
			} else if (i % 3 == 0) {
				managerClassification(manager[1], animal[i]);
				animals[i] = null;
			}

		}

	}

	public void printManagerAnimal() {
		managerAddAnimal();
		
		for (int i = 0; i < manager.length; i++) {
			manager[i].printAnimals();
		}
		
		System.out.println("조련사가 없는 동물");
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i].getSpecies());
			}
		}
		System.out.println();
	}

	public void classification() {
		int j = 0;
		int n = 0;
		for (int i = 0; i < animal.length; i++) {
			if (animal[i].getFeed() > 0) {
				m[j] = (EatMeat) animal[i];
				j++;
			} else if (animal[i].getFeed() < 0) {
				h[n] = (Herbivore) animal[i];
				n++;
			}
		}
	}

	public void printMeat() {
		for (EatMeat e : m) {
			if (e != null) {
				e.eatMeat();
			}
		}
		System.out.println();
	}

	public void printHerbivore() {
		for (Herbivore r : h) {
			if (r != null) {
				r.eatHerbivore();
			}
		}
		System.out.println();
	}

	public void ZooManage() {
		classification();
		while (true) {
			System.out.print("1:육식 동물\n2:초식 동물\n3:조련사별 동물\n4:종료");
			System.out.println();
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println();

			switch (n) {
			case 1:
				System.out.println("*육식 동물*");
				printMeat();
				break;
			case 2:
				System.out.println("*초식 동물*");
				printHerbivore();
				break;
			case 3:
				printManagerAnimal();
				break;
			case 4:
				return;
			default:
				break;
			}
		}
	}
}
