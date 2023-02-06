package Blind75;
/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
   Find two lines that together with the x-axis form a container, such that the container contains the most water.
   Return the maximum amount of water a container can store. 
   Notice that you may not slant the container.
 */
public class Lt11 {
    public static void main(String[] args) {
        int[] height= {1,1};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left; //width for every iteration
            int h = Math.min(height[left], height[right]); //height is the min between left and right index
            int area = h * w; //area is height * width
            max = Math.max(max, area); //max between the current max area vs current area of the iteration
            if(height[left] < height[right]) left++; 
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
        
    }
}
