package creational.builder;

/**
 * The builder class solves the problem of telescoping anti-pattern problem.
 * 
 * @author amirnasiri
 *
 */
public class Burger {

	protected int size;
	protected boolean cheese = false, pepperoni = false, lettuce = false, tomato = false;

	public Burger(BurgerBuilder builder) {
		this.cheese = builder.cheese;
		this.tomato = builder.tomato;
		this.lettuce = builder.lettuce;
		this.pepperoni = builder.pepperoni;
		this.size = builder.size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public boolean isPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public void setLettuce(boolean lettuce) {
		this.lettuce = lettuce;
	}

	public boolean isTomato() {
		return tomato;
	}

	public void setTomato(boolean tomato) {
		this.tomato = tomato;
	}

	@Override
	public String toString() {
		return "Burger [size=" + size + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", lettuce=" + lettuce
				+ ", tomato=" + tomato + "]";
	}

}
