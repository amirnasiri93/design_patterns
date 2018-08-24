package structural.bridge;

public class Main {

	public static void main(String[] args) {
		DarkTheme dark = new DarkTheme();
		LightTheme light = new LightTheme();
		WebPage about = new About(dark);
		WebPage careers = new Careers(light);
		careers.getContent();
		about.getContent();
		dark.getColor();
	}
}
