import java.util.*;

public class MAin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<Integer>();

        // Create a List to store duplicate elements
        List<Integer> duplicateElements = new ArrayList<Integer>();

        for (Integer element : list) {
            if (!set.add(element)) {
                duplicateElements.add(element);
            }
        }

        System.out.println("Duplicate elements: " + duplicateElements);
    }
}
