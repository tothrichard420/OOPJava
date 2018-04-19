import java.util.Scanner;

import Exception.DivisionbyZeroException;

public class Calc2 {

	public static void main(String[] args) {
		// scanner to read from console
		Scanner scanner = new Scanner(System.in);
		String operator;
		Double firstNumber;
		Double secondNumber;
		while(true) {
			System.out.println("Enter the first number: ");
			firstNumber = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			secondNumber = scanner.nextDouble();
			System.out.println("Enter operator: ");
			operator = scanner.next();
			try {
				Util.calculate(operator, firstNumber, secondNumber);
			} catch (DivisionbyZeroException e) {
				e.printStackTrace();
			}
		}
	}
}
