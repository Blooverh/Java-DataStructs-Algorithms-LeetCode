public class removeElements {
    public static void main(String[] args) {
        int[] x={0,1,2,2,3,0,4,2};
        System.out.println(remove(x, 2));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length ==0){return 0;}
        int k=0; //start size for the array
        for(int n: nums){ //for integer n in nums 
            if(n != val){ // if n is not equal to value 
                nums[k++]=n; // n is changed to the next value index 
            }
        }

        return k; //k is the length of the array after removing elements 
    }

    //easier to understand 
    public static int remove(int[] nums, int val){
        if(nums.length ==0){return 0;}
        int k=0; //initial valid size for the modified array 
        for (int i=0; i< nums.length; i++){
            if(nums[i]!=val){ // if value at i is not equals to val 
                nums[k]= nums[i]; // value at index k becomes the same as the value at index i
                k++; //increment k for valid size of the modified array
            }
        }
        return k; //returns length of the modified original array
    }
}
