package logLevels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
		System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));
		// Task 2
		System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
		// Task 3
		System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
	}

}
