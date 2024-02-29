import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myFruits = getStringHashSet();
        String fruitIDoNotLike = "orange";
        removeElement(myFruits, fruitIDoNotLike);
        emptyList(myFruits);
    }

    public static HashSet<String> getStringHashSet() {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("orange");
        return fruits;
    }

    public static void removeElement(HashSet<String> listOfFruits, String fruit) {
        Iterator<String> iterator = listOfFruits.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (Objects.equals(element, fruit)) {
                System.out.println("Inside list: " + listOfFruits + " there is fruit: " + fruit + ". \nProceed to remove: " + fruit + "..");
                iterator.remove();
                System.out.println("The list without: " + fruit + " is: " + listOfFruits);
                return;
            }
        }
        System.out.println("Inside list: " + listOfFruits + " there is no fruit: " + fruit);
    }

    public static void emptyList (HashSet<String> listOfFruits) {
        if (!listOfFruits.isEmpty()) {
            System.out.println("List: "+ listOfFruits + " is not empty. \nProceed to empty the list");
            listOfFruits.clear();
        }
        System.out.println("List my fruits: " + listOfFruits + " is empty");
    }
}