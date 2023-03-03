package LeetcodeV1;
public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] words= {"flower", "flight", "flow"};
        System.out.println(longestCommonPre(words));
    }

    //Approach 1
    public static String longestCommonPre(String[] str){
        String lcp=str[0];
        for(int i=1; i<str.length; i++){
            while(str[i].indexOf(lcp)!=0){
                lcp=lcp.substring(0, lcp.length()-1);
            }
        }
        
        return lcp;
           
    }
}
