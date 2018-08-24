package creational.factory_method_two;

import java.util.ArrayList;

public abstract class MazeGame {
	private final ArrayList<Room> rooms = new ArrayList<>();

	public MazeGame() {
		Room room1 = makeRoom();
		//Room room2 = makeRoom();
		// room1.connect();
		rooms.add(room1);
		//rooms.add(room2);
	}

	abstract protected Room makeRoom();
}
