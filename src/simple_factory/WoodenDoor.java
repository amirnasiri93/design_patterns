package simple_factory;

/**
 * This is a concrete object that implements the Door interface.
 * 
 * @author amirnasiri
 *
 */
public class WoodenDoor implements Door {
	private float height, width;

	public WoodenDoor(float height, float width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public float getWidth() {
		return width;
	}

	@Override
	public float getHeight() {
		return height;
	}

}
