package squeakyClean;

public class SqueakyClean {
	// Method does not mention public becomes package-private, only accessible within the same package
	static String clean(String identifier) {
        String answer = "";
        // Task 1: replace " " to "_"
        // Immutable, so the replace answer needs to be assigned to variable
        answer = identifier.replace(' ', '_');
        // Task 2
        // Find "-" and change the next char to upper case and remove "-"
        // Convert char to String(class): using Character.toString(char)
        if (identifier.contains("-")){
            int index = answer.indexOf("-");
            char nextCharacter = Character.toUpperCase(answer.charAt(index + 1));
            String temp = "";
            temp = temp.concat(answer.substring(0, index)).concat(Character.toString(nextCharacter)).concat(answer.substring(index + 2));
            answer = temp;
        }
        // Task 3
        answer = answer.replace('4', 'a');
        answer = answer.replace('3', 'e');
        answer = answer.replace('0', 'o');
        answer = answer.replace('1', 'l');
        answer = answer.replace('7', 't');
        // Task 4
        int length = answer.length();
        String temp = "";
        for(int i = 0; i < length; i++){
            if(Character.isLetter(answer.charAt(i)) || answer.charAt(i) == '_'){
                temp = temp.concat(Character.toString(answer.charAt(i)));
            }
        }
        answer = temp;
        return answer;
    }
}
