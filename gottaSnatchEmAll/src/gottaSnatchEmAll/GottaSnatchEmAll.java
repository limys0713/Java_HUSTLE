package gottaSnatchEmAll;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards); // HashSet >> modifiable set
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card); // It will return boolean var
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        // Primitive types(int, double, char, boolean...) >> assigned by value
        // Objects(List, Set, Map, custom classes...) >> assigned by reference(pointer)
        Set<String> copy_myCollection = new HashSet<>(myCollection);
        copy_myCollection.removeAll(theirCollection);    // Even though it will return a boolean value, it is ok to not assign a var to receive the return value;
        Set<String> copy_theirCollection = new HashSet<>(myCollection);
        copy_theirCollection.removeAll(myCollection);
        return !copy_myCollection.isEmpty() && !copy_theirCollection.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> copy = new HashSet<>(collections.get(0)); // Get the first set
        for(Set<String> i : collections){
            copy.retainAll(i);
        }
        return copy;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> copy = new HashSet<>(collections.get(0));
        for(Set<String> i : collections){
            copy.addAll(i);
        }
        return copy;
    }
}
