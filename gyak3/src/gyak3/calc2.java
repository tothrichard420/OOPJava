package gyak3;

import java.util.Scanner;

public class calc2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Double number1,number2;
		String operator;
		while (true){
			number1 = scanner.nextDouble();
			number2 = scanner.nextDouble();
			operator = scanner.nextLine();
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
