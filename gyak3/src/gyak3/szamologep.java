package gyak3;

import java.util.Scanner;

public class szamologep {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Double number1,number2;
		String operator;
		String calculation;
		while (true){
			calculation = scanner.nextLine();
			number1 = Double.parseDouble(calculation.split(" ")[0]);
			number2 = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
			calc(operator, number1, number2);
		}
	}
	public static void calc( String operator, Double number1, Double number2){
		System.out.println("Result: ");
		switch (operator){
		case "+":
			System.out.println(number1 + number2);
			break;
		case "-":
			System.out.println(number1 - number2);
			break;
		case "*":
			System.out.println(number1 * number2);
			break;
		case "/":
			if (!number2.equals(0.0))
				System.out.println(number1 / number2);
			else 
				System.out.println("Nem oszthato 0-val.");
			break;
		}
	}
}
