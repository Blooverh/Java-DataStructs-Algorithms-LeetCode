import java.util.HashMap;

public class LongestSubstringWithoutRepetitions {
    public static void main(String[] args) {
        //abcabcbb
        //bbbbb
        //pwwkew
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        if(s.length()==0){
            return 0;
        }

        int max=0; //will return the max substring value of the string s
        for(int i=0, j=0; i< s.length(); i++ ){
            //if character is in map as a key
            if(map.containsKey(s.charAt(i))){
                j= Math.max(j, map.get(s.charAt(i))+1); // j= the max between the number j and value of the next character in map 
            }
            map.put(s.charAt(i),i); //puts the current character and current index in map 
            max= Math.max(max, i-j+1); // max will be between 0 and i-j+1
        }

        return max;
    }
}
