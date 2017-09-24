
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	VirtualPet adoptablePet = new VirtualPet(null, null, 0, 0, 0);
	Map<String, VirtualPet> myShelter = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> availablePets() {
		return myShelter.values();
	}

	public void addPet(VirtualPet adoptablePet) {
		String petsAvailable = adoptablePet.getPetName();
		myShelter.put(petsAvailable, adoptablePet);
	}

	public void removePet(String upForAdoption) {
		myShelter.remove(upForAdoption);
	}

	public void showPets(VirtualPet adoptablePet) {

		for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {
			System.out.println("Name : " + entry.getKey() + " \tType : " + entry.getValue().getPetType()
					+ "\tInterest: " + entry.getValue().getPetInterest() + "\tNutrition: "
					+ entry.getValue().getPetNutrition() + "\tHydration: " + entry.getValue().getPetHydration());
		}
	}

	public VirtualPet getPetNamed(String name) {
		return myShelter.get(name);
	}

	public Collection<VirtualPet> showTypes(VirtualPet adoptablePet) {
		return myShelter.values();
	}

	public void callTick(VirtualPet adoptablePet) {

		for (VirtualPet entries : availablePets()) {
			entries.tick();
		}
	}

	public void feedPets(VirtualPet adoptablePet) {
		for (VirtualPet entries : availablePets()) {
			entries.feed();
		}
	}

	public void waterPets(VirtualPet adoptablePet) {
		for (VirtualPet entries : availablePets()) {
			entries.water();
		}
	}

	public boolean hasPets() {
		return !myShelter.isEmpty();
	}
}
