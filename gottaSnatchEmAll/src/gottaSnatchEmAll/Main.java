package gottaSnatchEmAll;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		System.out.println(GottaSnatchEmAll.newCollection(List.of("Newthree", "Newthree", "Newthree")));
		// Task 2
		Set<String> collection = GottaSnatchEmAll.newCollection(List.of("Newthree"));
		System.out.println(GottaSnatchEmAll.addCard("Scientuna",collection));
		// => true
		System.out.println(collection.contains("Scientuna"));
		// => true
		// Task 3
		Set<String> myCollection = Set.of("Newthree");	// Set.of >> immutable set
		Set<String> theirCollection = Set.of("Scientuna");
		System.out.println(GottaSnatchEmAll.canTrade(myCollection, theirCollection));
		// => true
		// Task 4
		System.out.println(GottaSnatchEmAll.commonCards(List.of(Set.of("Scientuna"), Set.of("Newthree","Scientuna"))));
		// => {"Scientuna"}
		// Task 5
		System.out.println(GottaSnatchEmAll.allCards(List.of(Set.of("Scientuna"), Set.of("Newthree","Scientuna"))));
		// => {"Newthree", "Scientuna"}
	}

}
