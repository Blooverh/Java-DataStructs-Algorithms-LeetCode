import java.util.HashMap;

public class Lt5 {

    /*Given a string s, return the longest palindromic substring in s. */
    public static void main(String[] args) {
        String s="eabcb";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        //String res = null;
        int palindromeStartsAt = 0, maxLen = 0;

        boolean[][] dp = new boolean[n][n];
        // dp[i][j] indicates whether substring s starting at index i and ending at j is palindrome
        
        for(int i = n-1; i >= 0; i--) { // keep increasing the possible palindrome string
            for(int j = i; j < n; j++) { // find the max palindrome within this window of (i,j)
                
                //check if substring between (i,j) is palindrome
                dp[i][j] = (s.charAt(i) == s.charAt(j)) // chars at i and j should match
                && ( j-i < 3  // if window is less than or equal to 3, just end chars should match
                || dp[i+1][j-1]  ); // if window is > 3, substring (i+1, j-1) should be palindrome too
                
                //update max palindrome string
                if(dp[i][j] && (j-i+1 > maxLen)) {
                    palindromeStartsAt = i;
                    maxLen = j-i+1;
                }
            }
        }
        return s.substring(palindromeStartsAt, palindromeStartsAt+maxLen);
        
        
    } 
}

/*left to right and right to left when both are equal
 return the substring from i to i-something */

//we can use hash map to store each word at its index 
/*Once we find the last word that will make a palindrome, we use substring method
 * to return the palindrom substring based on the keys which are the index position
 * of each character  
 */