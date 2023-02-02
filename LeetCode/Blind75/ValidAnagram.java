package Blind75;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s= "anagram";
        String t= "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] alphabet= new int[26];

        if(s.length() ==0 || t.length() == 0){
            return false;
        }

        for(int i=0; i< s.length(); i++){
            alphabet[s.charAt(i)-'a']++; //stores in array the character in its alphabte position increamenting by beggining character in string s
        }

        for(int i=0; i< s.length(); i++){
            alphabet[t.charAt(i)-'a']--; //Stores in array the character in its alphabet position decrementing from end of string to beginning of string
        }

        System.out.println(Arrays.toString(alphabet));
        // if there is a character that is not in one string but its in the other, array at index of that character increments by 1
        //hence being false because an anagram uses all characters from one string to create a new one.
        for(int i: alphabet){
            if(i!=0){
                return false;
            }
        }

        return true;

        
    }
}
