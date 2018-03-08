package my.first;

public class Main {

	public static void main(String[] args) {
		Alkalmazott ricsi = new Alkalmazott();
		ricsi.setName("Tóth Richárd");
		ricsi.setSalary(0);
		System.out.println(ricsi.toString());
		ricsi.raiseSalary(500);
		System.out.println(ricsi);
		System.out.println(ricsi.isBetweenSalary(200,  1000));
		System.out.println(ricsi.isBetweenSalary(1000, 2000));
		System.out.println(ricsi.getTax());
		Alkalmazott bence = new Alkalmazott();
		bence.setName("Bence Bogdán");
		bence.setSalary(0);
		bence.raiseSalary(500);
	}

}
