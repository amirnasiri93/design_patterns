package creational.factory_method_two;

public class OrdinaryMazeGame extends MazeGame {

	@Override
	protected Room makeRoom() {
		return new OrdinaryRoom();
	}

}
