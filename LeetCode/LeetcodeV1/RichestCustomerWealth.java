package LeetcodeV1;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts= {{1,2,3},
                            {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i =0;i<accounts.length;i++){// index at row 
            int temp = 0; //stores temporary result for rach row
            for(int j = 0;j<accounts[i].length;j++){ // iterates through each value in length of current row
                temp+=accounts[i][j];
            }
            res = Math.max(res,temp); //compares each rows temporary sum, which ever has highest becomes the result until all rows are covered 
        }
        return res;
    }

        

}

