package Blind75;

import java.util.Arrays;

/*
 * Given an integer array nums, return the length of the longest strictly increasing subsequence
 * 
 * Example: 
 * Input= nums=[10,9,2,5,3,7,101,18]
 * output= 4
 * longest increasing subsequent is [2,3,7,101]
 */
public class Lt300 {
    public static void main(String[] args) {
        //int[] nums={10,9,2,5,3,7,101,18};
        //int[] nums={7,7,7,7,7,7,7};
        //int[] nums={4,10,4,3,8,9};
        int[] nums={0,1,0,3,2,3};
        int y= lengthOfLIS(nums);
        System.out.println(y);
    }
    //Answer:
    //https://leetcode.com/problems/longest-increasing-subsequence/solutions/74824/java-python-binary-search-o-nlogn-time-with-explanation/?orderBy=most_votes&languageTags=java
    public static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length]; //stores the smallest tail of all increasing sub sequences 
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
}
