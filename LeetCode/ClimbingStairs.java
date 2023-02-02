public class ClimbingStairs {

    /*
     * You are climbing a staircase. It takes n steps to reach the top. 
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * Input: n = 2 
     * Output: 2 
     * Explanation: There are two ways to climb to the top.
     * 1 step + 1 step 
     * 2 steps
     */
    public static void main(String[] args) {
        int n=3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int f0=0;
        int f1=1;
        int f2=2;

        if(n==0){
            return f0;
        }else if(n==1){
            return f1;
        }else if(n==2){
            return f2;
        }

        for(int i=3; i<=n; i++){
            f0=f1;
            f1=f2;
            f2=f1+f0;
            
        }

        return f2;
        
    }
}
