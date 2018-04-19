
import Exception.*;

public class Util {
	public static void calculate(String operator, Double firstNumber, Double secondNumber) throws DivisionbyZeroException {
		System.out.print("Result: ");
		switch (operator) {
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "/":
			if (!secondNumber.equals(0.0))
				System.out.println(firstNumber / secondNumber);
			else
				throw new DivisionbyZeroException("cannot divide by zero");
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;

		default:
			System.out.println("unknown operator");
			break;
		}

	}

}
