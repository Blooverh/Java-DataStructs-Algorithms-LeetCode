package Blind75;

import java.util.ArrayList;

public class Lt152 {
    public static void main(String[] args) {
        //int[] nums={2,3,-2,4};
        //int[] nums= {-4,-3};
        int[] nums={0,2};
        //int[] nums={2,-1,1,1};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        //HashMap<Integer, Integer> summation=  new HashMap<>(); //<key, value> value is the summation of the first iteration
        //int[] res -> stores all the products in the array at each index, sort and return last index 
        //ArrayList -> stores all the products, sort and return last index 
        ArrayList<Integer> res= new ArrayList<>();
        //int[] res= new int[nums.length*2];

        if(nums.length==0){
            return 0;
        }else if(nums.length ==1){
            return nums[0];
        }

        //solving in O(n^2)
        for(int i=0; i<= nums.length-1; i++){
            res.add(nums[i]);
            for(int j=i+1; j<= nums.length-1; j++){
                nums[i]*= nums[j];
                res.add(nums[i]);
            }
            System.out.println(res.get(i));
            nums[i]=0;
            
        }
        System.out.println(res);
        int max=Integer.MIN_VALUE;
        for(int i=0; i<res.size()-1; i++){
            //System.out.println("i is "+res.get(i));
            //System.out.println("i+1 is "+res.get(i+1));
            //max= Math.max(max, res.get(i));
            //max=Math.max(max, res.get(i+1));
            max=Math.max(max, Math.max(res.get(i), res.get(i+1)));
            System.out.println("Max is "+max);
        }
        
        System.out.println(max);
        //Arrays.sort(res);
        return max;

    }

    //Best Optimal Solution O(2n) =O(n)
    public int maxProduct2nd(int[] nums) {
        int max = Integer.MIN_VALUE;// instead of starting max as 0 start as minimum integer value 
        int prod = 1;
        // runs left to right to find best max
        for(int i = 0 ; i < nums.length; i++) {
            prod = prod * nums[i]; 
            max = Math.max(max, prod); 
            if(prod == 0) {
                prod = 1;
            }
        }

        prod = 1;
        //from right to left to find the max between above loop with this loop and find ultimate max value
        for(int j = nums.length - 1; j >= 0; j--) {
            prod = prod * nums[j];
            max = Math.max(max,prod);
            if(prod == 0) {
                prod = 1;
            }
        }

        return max;
    }
}
