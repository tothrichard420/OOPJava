import java.util.Scanner;

public class tomb {
	public static void main(String[] args){
		int size = 10;
		double sum = 1;
		double geometri;
		double[] array = new double [size];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextDouble();
		}	
		for (int i = 0; i < array.length; i++) {
			sum = array[i] * sum;
		}
		geometri = Math.pow(sum, 0.1);
		System.out.println(geometri);
	}
}
