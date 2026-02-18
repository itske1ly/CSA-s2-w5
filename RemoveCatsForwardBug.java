import java.util.*;

public class RemoveCatsForwardBug {
    public static void main(String[] args) {
        // What we are trying to do here is to write code segments to
        // remove all "cat" in the arrayList.

        // Step 0: initialize an ArrayList ["cat", "cat", "dog", "cat", "cat", "fish"]
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("cat");
        animals.add("dog");
        animals.add("cat");
        animals.add("cat");
        animals.add("fish");
        

        // Step 1: This is the overall structure of a for loop you need:
        // Replace all the underscore with correct number/variable names
       for (int i = 0; i < animals.size(); i++) {
            
            // Step 2: How do you compare if each element is the same thing as "cat"?
            // Remember, you are comparing Strings!
            if (animals.get(i).equals("cat")) {
                animals.remove(i);
                i--;
                
                // Step 3: inside this if statement, you need to do what?
                // How do you remove something from an array?
            }
        }

        // Step 4: Print the array to see what it looks like
        System.out.println("Buggy result: " + animals);
    }
}