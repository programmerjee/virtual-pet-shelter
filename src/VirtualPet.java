public class VirtualPet {

	public String petName;
	public String petType;
	public int petInterest;
	public int petNutrition;
	public int petHydration;

	public VirtualPet(String name, String type, int interest, int nutrition, int hydration) {
		petName = name;
		petType = type;
		petInterest = interest;
		petNutrition = nutrition;
		petHydration = hydration;
	}

	public VirtualPet(String name, String description) {
		this.petName = name;
		this.petType = description;
		this.petInterest = 50;
		this.petNutrition = 50;
		this.petHydration = 50;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int getPetInterest() {
		return petInterest;
	}

	public int getPetNutrition() {
		return petNutrition;
	}

	public int getPetHydration() {
		return petHydration;
	}

	public void tick() {
		petInterest -= 1;
		petNutrition -= 1;
		petHydration -= 1;
	}

	public void play() {
		petInterest += 7;
		petHydration -= 1;
	}

	public void feed() {
		petNutrition += 7;
		petHydration -= 1;

	}

	public void water() {
		petHydration += 7;
		petInterest -= 2;
	}
}