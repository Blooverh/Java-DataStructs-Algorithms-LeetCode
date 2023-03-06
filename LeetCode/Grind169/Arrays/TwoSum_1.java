package Grind169.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target){
        int res[]= new int[2]; //stores both indices of num array that have values that add up to target
        HashMap<Integer, Integer> map= new HashMap<>();  //stores numbers of num array as key and its indices as values in map

        //iterated through the array
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(target- nums[i])){ //checks if a key with value target- nums[i] exists in hashmap
                //if it does
                res[1]=i; //store the current i at position 1 of array result 
                res[0]=map.get(target - nums[i]); //store at position 0 the value of the number in the hashmap that is equal to target-nums[i]
            }
            //if the if statement is not satisfied, put in map current i and its value from nums array 
            map.put(nums[i], i);
        }

        return res; //return result array
    }
}
