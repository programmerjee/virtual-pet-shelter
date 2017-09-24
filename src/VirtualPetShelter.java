import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	VirtualPet adoptablePet = new VirtualPet(null, null, 0, 0, 0);
	Map<String, VirtualPet> myShelter = new HashMap<String, VirtualPet>();
	Iterator<Entry<String, VirtualPet>> eachPet = myShelter.entrySet().iterator();
	
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

	public Collection<VirtualPet> showTypes(VirtualPet adoptablePet) {
		return myShelter.values();
	}
	// tick method not working!
	public void callTick(VirtualPet adoptablePet) {
		   while (eachPet.hasNext()) {
			      Entry<String, VirtualPet> pet = eachPet.next();
			      ((VirtualPet) pet).tick();
			    }
			}
	}
		public VirtualPet getPetNamed(String name) {
			return myShelter.get(name);
		}
	// feed all pets in shelter not working!
	public void feedPets(VirtualPet adoptablePet) {
	    while (eachPet.hasNext()) {
	      Entry<String, VirtualPet> pet = eachPet.next();
	      ((VirtualPet) pet).feed();
	    }
	}

	// water all pets in shelter not working!
	public void waterPets(VirtualPet adoptablePet) {
		 while (eachPet.hasNext()) {
		      Entry<String, VirtualPet> pet = eachPet.next();
		      ((VirtualPet) pet).water();
		    }
	}

	public boolean hasPets() {
		return !myShelter.isEmpty();
	}
}
