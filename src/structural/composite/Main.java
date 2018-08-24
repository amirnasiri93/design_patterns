package structural.composite;

public class Main {

	public static void main(String[] args) {
		Organisation org = new Organisation();
		Employee dev = new Developer("amir", 1);
		Employee des = new Designer("ali", 2112);
		org.addEmployee(des);
		org.addEmployee(dev);
		System.out.println("Total salary: " + org.getNetSalary());
	}

}
