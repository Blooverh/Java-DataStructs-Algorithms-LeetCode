package LeetcodeV1;
import java.util.Arrays;

public class ConcatenationArr {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenation2(nums)));
    }
    //My solution
    public static int[] getConcatenation(int[] nums) {
        int[] answer= new int[nums.length*2];

        for(int i=0, j=answer.length/2; i<(answer.length/2); j++, i++){
            answer[i] = nums[i];
            answer[j]=nums[i];
        }

        return answer;
    }

    //Other Faster 0ms solution
    public static int[] getConcatenation2(int[] nums) {
        int[] myArr = Arrays.copyOf(nums, 2*nums.length); // myarr has 6 length (3*2). already copies the original array, thus only the 2nd half of the array needs to be added
        int index=nums.length; //index becomes 3
        for(int i=0;i<nums.length;i++) {
            myArr[index++]=nums[i]; 
        }
        return myArr;
    }
}
