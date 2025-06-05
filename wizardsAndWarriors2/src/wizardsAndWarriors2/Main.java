package wizardsAndWarriors2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		Character character = new Character();
		character.setCharacterClass("Wizard");
		character.setLevel(4);
		character.setHitPoints(28);
		System.out.println(new GameMaster().describe(character));
		// => "You're a level 4 Wizard with 28 hit points."
		// Task 2
		Destination destination = new Destination();
		destination.setName("Muros");
		destination.setInhabitants(732);
		System.out.println(new GameMaster().describe(destination));
		// => "You've arrived at Muros, which has 732 inhabitants."
		// Task 3
		System.out.println(new GameMaster().describe(TravelMethod.HORSEBACK));
		// => "You're traveling to your destination on horseback."
		// Task 4
		System.out.println(new GameMaster().describe(character, destination, TravelMethod.HORSEBACK));
		// => "You're a level 4 Wizard with 28 hit points. You're traveling to your destination on horseback. You've arrived at Muros, which has 732 inhabitants."
		// Task 5
		System.out.println(new GameMaster().describe(character, destination));
		// => "You're a level 4 Wizard with 28 hit points. You're traveling to your destination by walking. You've arrived at Muros, which has 732 inhabitants."
	}

}
