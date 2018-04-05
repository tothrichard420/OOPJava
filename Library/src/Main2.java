import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Bookstyle[]booksWithStyle = new Bookstyle[scanner.nextInt()];
		booksWithStyle[0] = new Bookstyle("Stargate", "thor", 1998,42,"scifi");
		for (int i = 0; i < booksWithStyle.length; i++) {
			booksWithStyle[i] = new Bookstyle("Trónok Harca"+i, "George"+i+"Martin", 2000+i, i*1000, "fantasy"+new Random().nextInt(3));
		}
		double count = 0;
		if (booksWithStyle.length<0) {
			count=1;
		}
		boolean newStyle = true;
		for (int i = 0; i < booksWithStyle.length; i++) {
			for (int j = 0; j < i; j++) {
				if (booksWithStyle[i].getStyle().equalsIgnoreCase(booksWithStyle[j].getStyle())) {
					newStyle = false;
					break;
				}
			}
			if(newStyle){
				count++;
			}
		}
		for (Bookstyle bookstyle : booksWithStyle) {
			if (bookstyle.getStyle().equalsIgnoreCase("scifi")) {
				System.out.println(bookstyle);
			}
		}
		double avgPrice=0;
		count=0;
		for (Bookstyle bookstyle : booksWithStyle) {
			if (bookstyle.getStyle().equalsIgnoreCase("scifi")) {
				count++;
				avgPrice = bookstyle.getPrice();
			}
		}

	}

}
