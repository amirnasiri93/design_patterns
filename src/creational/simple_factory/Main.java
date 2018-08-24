package creational.simple_factory;

public class Main {

	public static void main(String[] args) {
		WoodenDoor door = DoorFactory.makeDoor(100, 220);
		System.out.println(door.getHeight());
		System.out.println(door.getWidth());

	}

}
