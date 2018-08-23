package prototype;

public class Main {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("dolly", "Mountain Sheep");
		System.out.println(sheep);

		try {
			Sheep clone = (Sheep) sheep.clone();
			System.out.println(clone);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
