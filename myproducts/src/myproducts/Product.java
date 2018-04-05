package myproducts;

public class Product {
	private String name;
	private int price;
	private int tax;
	
	public Product (String name, int price, int tax){
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	public int getPriceWithInt(){
		return (Integer) price*(1+tax/100);
	}
	@Override
	public String toString(){
		return name+","+getPriceWithInt()+"ft";
	}
	
	public void reisePrice(int percentage){
		price=price*(percentage/100);
	}
	public int compareProducts(Product other){
		if(getPriceWithInt()>other.getPriceWithInt()){
			return 1;
		}
		if(getPriceWithInt()<other.getPriceWithInt()){
			return -1;
		}
		return 0;
	}
}
