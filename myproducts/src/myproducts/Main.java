package myproducts;

public class Main {

	public static void main(String[] args) {
		Bread bread = new Bread("Barna kenyér", 220, 21, 0.50);
		Product product = new Product("Hangszóró", 50000, 20);
		System.out.println(bread);
		System.out.println(product);
		Product product2 = new Bread("Kovászos kenyér", 500, 27, 0.54);
		System.out.println(product2);
		Bread bread2 = new Bread ("Kifli", 300, 12, 0.1);
		System.out.println(Bread.firstIstoreExpansive(bread2, (Bread)product2));
		System.out.println((Product)bread2);
	}
}
