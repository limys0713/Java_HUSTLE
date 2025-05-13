package salaryCalculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		SalaryCalculator salary = new SalaryCalculator();
		int daysSkipped = 3;
		System.out.println(salary.salaryMultiplier(daysSkipped));
		daysSkipped = 7;
		System.out.println(salary.salaryMultiplier(daysSkipped));
		// Task 2
		int productsSold = 21;
		System.out.println(salary.bonusMultiplier(productsSold));
		System.out.println(salary.bonusForProductsSold(productsSold));
		productsSold = 5;
		System.out.println(salary.bonusMultiplier(productsSold));
		System.out.println(salary.bonusForProductsSold(productsSold));
		// Task 3
		daysSkipped = 2;
		productsSold = 3;
		System.out.println(salary.finalSalary(daysSkipped, productsSold));
		productsSold = 90;
		System.out.println(salary.finalSalary(daysSkipped, productsSold));
	}

}
