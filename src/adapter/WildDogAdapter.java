package adapter;

public class WildDogAdapter implements Lion {
	WildDog dog;

	public WildDogAdapter(WildDog dog) {
		this.dog = dog;
	}

	@Override
	public void roar() {
		dog.bark();

	}

}
