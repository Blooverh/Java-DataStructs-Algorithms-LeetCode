package LeetcodeV1;

public class romanToInt {
    public static void main(String[] args) {
        System.out.println(toRoman("MCMXCIV"));
    }

    public static int toRoman(String s){
        
        int[] nums= new int[s.length()]; //set array to have length of string s 
        //for each letter in string s that is a roman numeral, assign the values 
        for(int i=0; i< s.length(); i++){
            switch( s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X':
                    nums[i]=10;  
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;          
                
            }
        }

            int sum=0; //sums start at 0
            //for loop to add each number to sum 
            for(int j=0; j< nums.length-1; j++){
                if(nums[j]<nums[j+1]){ //if num at j is less than the next num, subtract the num at j from the variable sum
                    sum-=nums[j];
                }else {// if num at j is bigger than next num, add the num at j to the variable sum
                    sum+=nums[j];
                }
            }

        
        return sum+nums[nums.length-1]; //return the sum variable at last index-1
        
    }
}
