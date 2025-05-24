package wizardsAndWarriors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1 & 2
		Warrior warrior = new Warrior();
		System.out.println(warrior.toString());
		// Task 3
		System.out.println(warrior.isVulnerable());
		// Task 4
		Wizard wizard = new Wizard();
		System.out.println(warrior.getDamagePoints(wizard));
		// Task 5 & 6
		System.out.println(wizard.toString());
		// Task 7
		wizard.prepareSpell();
		System.out.println(wizard.isVulnerable());
		// Task 8
		System.out.println(wizard.getDamagePoints(warrior));
	}

}
