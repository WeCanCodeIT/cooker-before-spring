package kitchen;

public class Microwave extends Appliance implements Cooker {

	@Override
	public void cook() {
		System.out.println("Cooking by spinning polar molecules!");
	}

}
