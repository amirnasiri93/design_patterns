package factory_method_two;

public class MagicMazeGame extends MazeGame {

	@Override
	protected Room makeRoom() {
		return new MagicRoom();
	}

}
