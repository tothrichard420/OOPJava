import java.util.Scanner;

import Exception.DivisionbyZeroException;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while (true) {
			calculation = scanner.nextLine();
			firstNumber = Double.parseDouble(calculation.split(" ")[0]);
			secondNumber = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
			try {
				Util.calculate(operator, firstNumber, secondNumber);
			} catch (DivisionbyZeroException e) {
				e.printStackTrace();
			}
		}
	}
}
