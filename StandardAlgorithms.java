import java.util.ArrayList;

public class StandardAlgorithms {
    // Algorithm 1: Find Min (Same thing for Max)
    public static int findMin(ArrayList<Integer> arr){
        int smallest = arr.get(0);
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i) < smallest){
                smallest = arr.get(i);
            }
        }
        return smallest;
       
    }

    // Algorithm 2: Find Average
    public static double findAvg(ArrayList<Integer> arr){
        int sum = 0 ;
        for(Integer values : arr){
            sum += values;
        }
        double average = (double)sum / arr.size();
        return average;
    }

    // Algorithm 3: mode of elements
    public static int findMode(ArrayList<Integer> arr){
        int number = arr.get(0);
        int maxCount = 0;
        for(int i = 0; i < arr.size()-1; i++){
            int count = 0;
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(j)==arr.get(i)){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount= count;
                number = arr.get(i);
            }

        }
        return number;
       
    }

    // Algorithm 4: Search for a particular element in the array
    // This method will return the index of the
    // first element found in the array that is an even number
    public static int searchOne(ArrayList<Integer> arr){

        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i) % 2 == 0) {
                return i;
            }
        }
        return -1;
    }


    // Algorithm 5: Determine if all elements have a particular property
    // This method returns true if all elements are negative
    public static boolean allNegative(ArrayList<Integer> arr){
        for(int i= 0; i<arr.size(); i++){
            if(arr.get(i) >= 0){
                return false;
            }
        }
        return true;
   
    }


    // Algorithm 6: Count all consecutive pairs of elements
    // This method returns the number of consecutive pairs
    // For example: [2,3,3,1,1,3,2,2] has three consecutive pairs
    public static int countConsecutivePairs(ArrayList<Integer> arr){
        int count = 0;
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i)==arr.get(i+1)){
                    count++;
                }
        }
        return count;
       
    }


    // Algorithm 7: Determine the presence or absence of duplicate elements
    // This method returns ture if the if there are duplicated elements
    // for example: [1,2,3,1] -> true, 1 is duplicated
    public static boolean hasDuplicates(ArrayList<Integer> arr){
       for(int i = 0; i < arr.size()-1; i++){
        int value = arr.get(i);
        
        for(int j = i + 1; j < arr.size(); j++){
            if(arr.get(j).equals(value)){
                return true;
            }
        }
       }
       return false;
    }

    // Algorithm 8: Determine the number of elements meeting specific criteria
    // This method counts how many of the String-type elements in the ArrayList 
    // starts with the letter "a"
    // Pre-condition: Assume all elements have at least one character!
    // For example: ["app", "banana", "audio", "bear"] -> 2
    public static int firstLetterA(ArrayList<String> arr)
    {
        int count = 0;
        for(int i = 0 ; i < arr.size(); i++){
            if(arr.get(i).substring(0, 1).equals("a")){
                count++;
            }
        }
        return count;

    }

    
    // Algorithm 9: Shift or rotate elements left
    // For example: [1,2,3,4,5] -> [2,3,4,5,1]
    public static void shiftLeft(ArrayList<Integer> arr){
        int first = arr.get(0);
        for(int i = 0 ; i < arr.size()-1; i++){
            arr.set(i,arr.get(i+1));
        }
        
        arr.set(arr.size() - 1, first);
       
    }


    // Algorithm 9.5: Shift or rotate elements right
    // For example: [1,2,3,4,5] -> [5,1,2,3,4]
    public static void shiftRight(ArrayList<Integer> arr){
        int last = arr.get(arr.size()-1);
        for(int i = arr.size()-1; i > 0 ; i--){
            arr.set(i , arr.get(i-1));
        }

        arr.set(0, last);
       
    }



    // Algorithm 10: Reverse the order of the elements
    // For example: ["a", "b", "c", "d"] -> ["d", "c", "b", "a"]
    public static void reverse(ArrayList<String> arr){

        for(int i = 0 ; i < arr.size()/2; i++){
            String first = arr.get(i);
            String last = arr.get(arr.size()- 1 -i);
            String mid = first;

            arr.set(i,last);
            arr.set(arr.size()-1-i, mid);


        }
        
    }
}
