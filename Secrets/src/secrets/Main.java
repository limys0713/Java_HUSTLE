package secrets;

public class Main {
	public static void main(String[] args) {
		// Task 1
		System.out.println(Secrets.shiftBack(0b1001, 2));
		// Task 2
		System.out.println(Secrets.setBits(0b0110, 0b0101));
		// Task 3
		System.out.println(Secrets.flipBits(0b1100, 0b0101));
		// Task 4
		System.out.println(Secrets.clearBits(0b0110, 0b0101));
	}
}
