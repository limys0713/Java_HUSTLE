package calculatorConundrum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorConundrum calculator = new CalculatorConundrum();
		
		// Task 1
		System.out.println(calculator.calculate(16, 51, "+"));
		// => returns "16 + 51 = 67"
		System.out.println(calculator.calculate(32, 6, "*"));
		// => returns "32 * 6 = 192"
		System.out.println(calculator.calculate(512, 4, "/"));
		// => returns "512 / 4 = 128"
		
		//Task 2
		//System.out.println(calculator.calculate(10, 1, null));
		// => throws IllegalArgumentException with message "Operation cannot be null"
		//System.out.println(calculator.calculate(10, 1, ""));
		// => throws IllegalArgumentException with message "Operation cannot be empty"
		//System.out.println(calculator.calculate(10, 1, "-"));
		// => throws IllegalOperationException with message "Operation '-' does not exist"
		
		// Task 3
		System.out.println(calculator.calculate(512, 0, "/"));
		// => throws IllegalOperationException with message "Division by zero is not allowed"
	}

}
