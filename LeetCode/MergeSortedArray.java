import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m= 3;
        int n=3;
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        
        

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            System.out.println(Arrays.toString(nums1));
        }else if(m==0 && nums1.length >0){
            nums1[0]= nums2[0];
            System.out.println(Arrays.toString(nums1));
        }
        for(int i=m, j=0; i<= (n+m)-1; i++, j++){
            nums1[i]= nums2[j];
        }

        Arrays.sort(nums1);

        //System.out.println(Arrays.toString(nums1));
    }
    //FASTER SOLUTION
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     for(int i = m+n-1, j=m-1, k=n-1; i >= 0; i--) {
    //         // no more elements in nums2
    //         // this means all elements at the front
    //         // of nums1 belong there, so we can just return
    //         if(k < 0) break;

    //         // no more elements in nums1
    //         if(j < 0) {
    //             while(i >= 0) {
    //                 nums1[i--] = nums2[k--];
    //             }
    //             break;
    //         }

    //         // take the bigger one
    //         if(nums1[j] > nums2[k]) {
    //             nums1[i] = nums1[j--];
    //         } else {
    //             nums1[i] = nums2[k--];
    //         }
    //     }

    //     System.out.println(nums1);
    // }

}
