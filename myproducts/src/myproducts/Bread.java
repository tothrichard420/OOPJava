package myproducts;

public class Bread extends Product{
	private double weight;
	public Bread(String name, int price, int tax, double weight){
		super(name, price, tax);
		this.weight = weight;
	}
	@Override
	public String toString() {
		return super.toString()+"egységár:"+getPriceWithInt()/weight+"ft";
	}
	public double getQuantity() {
		return weight;
	}
	public static boolean firstIstoreExpansive(Bread first, Bread second){
		return (first.getPriceWithInt() / first.weight>second.getPriceWithInt()/second.weight);
	}
}
