package annalynInfiltration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Static and Non-static : Can call the static function without creating object
		// Question 1
		boolean knightIsAwake = true;
		System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));
		// Question 2
		knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
		// Question 3
		archerIsAwake = false;
		prisonerIsAwake = true;
		System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
		// Question 4
		knightIsAwake = false;
		archerIsAwake = true;
		prisonerIsAwake = false;
		boolean petDogIsPresent = false;
		System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
	}

}
