package singleton;

public class President {
	private static President current;
	private String name;

	private President(String name) {
		this.name = name;
	}

	public static President getPresident() {
		if (current == null) {
			current = new President("");
		}
		return current;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
