public class palindromeNum{
    public static void main(String[] args){
        int num=121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        //number cannot be negative 
        if(x<0){
            return false;
        }

        int div=1; //divisor
        while(x/div>=10){ //find the divisor
            div*=10;//div=100
        }
        while(x!=0){//compare the first and last digit
            int left=x/div;//left most digit
            int right=x%10;//right most digit
            if(left!=right){ //if left most digit is not equal to right most digit
                return false;
            }
            x=(x%div)/10;  //remove left most digit and right most digit
            div/=100;//reduce divisor by 2 digits
        }
        return true;//if all digits are equal
        //Time complexity: O(log10(n))
        
    }
}

