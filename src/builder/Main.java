package builder;

public class Main {

	public static void main(String[] args) {
		BurgerBuilder builder = new BurgerBuilder(2);
		builder.addCheese();
		builder.addLettuce();
		Burger b = builder.build();

		System.out.println(b);

	}

}
