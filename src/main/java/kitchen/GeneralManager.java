package kitchen;

import java.util.ArrayList;
import java.util.Collection;

public class GeneralManager {

	private Collection<Appliance> appliances = new ArrayList<>();
	
	public GeneralManager() {
	}
	
	public GeneralManager(Collection<Appliance> appliances) {
		this.appliances = appliances;
	}
	
	public void add(Appliance toAdd) {
		appliances.add(toAdd);
	}
	
	public void doYourJob() {
		System.out.println("GM doing my job!");
		for(Appliance a: appliances) {
			a.powerOn();
		}
	}
}
