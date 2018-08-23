package adapter;

public class Main {

	public static void main(String[] args) {
		// so initially this game contains hunters that want to hunt lions.
		Hunter hunter = new Hunter();
		hunter.hunt(new AsianLion());
		// now wild dogs have been added to the game, hunter can hunt those aswell.
		WildDogAdapter adapter = new WildDogAdapter(new WildDog());
		hunter.hunt(adapter);
	}

}
