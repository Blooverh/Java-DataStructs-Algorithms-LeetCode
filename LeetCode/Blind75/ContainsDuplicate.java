package Blind75;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    // My O(n) Solution
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateCount= new HashMap<>();

        if(nums.length ==0){
            return false;
        }
        //if nums[i] is a key in HashMap return true, if false jump and add nums[i] as key at index i
        for(int i=0; i<nums.length; i++){
            if(duplicateCount.containsKey(nums[i])){ 
                return true;
            }

            duplicateCount.put(nums[i], i);
        }

        return false;
    }

}
