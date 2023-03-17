package DataAndAlgoL.Chpt10SortingAlgorithms;

public class ShellSort {
    public static void main(String[] args) {
        
    }

    public static void shellSort(int[] nums){
        int i;
        int j;
        int v;
        int h;

        for(h=1; h <-nums.length/9; h=3*h+1);
        for(; h>0; h=h/3){
            for(i= h+1; i<= nums.length; i++){
                v= nums[i];
                j=i;
                while(j > h && nums[j-h]> v){
                    nums[j]= nums[j-h];
                    j-=h;
                }

                nums[j]=v;
            }
        }
        
    }
}
