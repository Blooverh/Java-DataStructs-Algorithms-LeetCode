package Blind75;
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    OUTPUT IS SUPPOSE TO BE THE INDICES OF THE ORIGINAL ARRAY AS VALUES IN RESULT ARRAY
 */

import java.util.*;
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
        
    }
    
    public static int[] twoSum(int[] nums, int target){
        int[] result= new int[2]; //array that will store both numbers 
        Map<Integer, Integer> map= new HashMap<Integer, Integer>(); //will store the value at index as key and value as index so we can fetch later if there is a key that contains the difference between target and a number in the array
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(target-nums[i])){ // there is a key in map where target - nums[i] exist 
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i); //puts number at index i as key and index as value 
        }

        return result;
        
    }
}

    /*
     * loops through array and stores every number at index i as a key 
     * once there is a key that satisfies target - nums[i], we store i as 2nd value in array as it will be greater than the other value that will be added to
     * Example: 
     * 1st iteration Map.put= {[2,0]} cuz if statement is false 
     * 2nd iteration target(9) - nums[1] (7) => 9-7 = 2 because if statement is true
     * then result[1] = i which in this case is 2nd iteration hence i=1
     * and result[0]= map.get(9-7) which is map.get(2) which has value 0
     * thus answer is result = [0,1]
     * Runs on O(n) 
     */
