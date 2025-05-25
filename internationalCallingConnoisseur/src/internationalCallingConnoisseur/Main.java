package internationalCallingConnoisseur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		DialingCodes dialingCodes = new DialingCodes();
		System.out.println(dialingCodes.getCodes());
		// Task 2
		dialingCodes.setDialingCode(679, "Unknown");
		dialingCodes.setDialingCode(679, "Fiji");
		System.out.println(dialingCodes.getCodes());
		// Task 3
		dialingCodes.setDialingCode(55, "Brazil");
		System.out.println(dialingCodes.getCountry(55));
		// Task 4
		dialingCodes.addNewDialingCode(32, "Belgium");
		dialingCodes.addNewDialingCode(379, "Vatican City");
		dialingCodes.addNewDialingCode(32, "Other");
		dialingCodes.addNewDialingCode(39, "Vatican City");
		System.out.println(dialingCodes.getCodes());
		// Task 5
		dialingCodes.addNewDialingCode(44, "UK");
		System.out.println(dialingCodes.findDialingCode("UK"));
		System.out.println(dialingCodes.findDialingCode("Unlisted"));
		// Task 6
		dialingCodes.addNewDialingCode(88, "Japan");
		dialingCodes.updateCountryDialingCode(81, "Japan");
		dialingCodes.updateCountryDialingCode(32, "Mars");
		System.out.println(dialingCodes.getCodes());
	}

}
