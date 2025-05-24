package karlsLanguages;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanguageList languageList = new LanguageList();
		// Task 1
		if (languageList.isEmpty()) {
		    System.out.println("The language list is empty!");
		}
		// Task 2
		languageList.addLanguage("Kotlin");
		languageList.addLanguage("Python");
		languageList.addLanguage("Scala");
		// Task 3
		languageList.removeLanguage("Scala");
		// Task 4
		System.out.println(languageList.firstLanguage()); 
		// Task 5
		System.out.println(languageList.count());
		// Task 6
		System.out.println(languageList.containsLanguage("Python"));
		System.out.println(languageList.containsLanguage("Ruby"));
		// Task 7
		System.out.println(languageList.isExciting());
	}

}
