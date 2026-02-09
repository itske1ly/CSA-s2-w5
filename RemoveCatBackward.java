import java.util.ArrayList;

public class RemoveCatBackward {
        public static void main(String[] args) {
            ArrayList<String> animals = new ArrayList<>();
            animals.add("cat");
            animals.add("cat");
            animals.add("dog");
            animals.add("cat");
            animals.add("cat");
            animals.add("fish");
            
            for (int i = animals.size()-1 ; i >= 0; i--) {
                if (animals.get(i).equals("cat")) {
                    animals.remove(i);
                }    
            // What happen if you loop through the arraylist backwards?
            // Rewrite the code but now instead of i++, do i--
            // Does doing this solve the problem?
            }
        System.out.println("Buggy result: " + animals);
        }
}
