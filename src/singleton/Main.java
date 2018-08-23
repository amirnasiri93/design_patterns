package singleton;

public class Main {

	public static void main(String[] args) {
		President p = President.getPresident();
		p.setName("Trump");
		System.out.println(p.getName());
		President t = President.getPresident();
		System.out.println(t.getName());
	}

}
