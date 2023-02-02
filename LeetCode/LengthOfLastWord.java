public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("  fly me  to  the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        
    }


    public static int lengthOfLastWord(String s) {
        int lengthOfLastword=0;
        for(int i= s.length()-1; i>= 0; i--){
            if(s.charAt(i) != ' '){
                lengthOfLastword++;
            }else {
              if(lengthOfLastword > 0){ //this allows that the next time charAt(i) is a space if length > 0 we have had already counted the last word 
                return lengthOfLastword;
              }
            }
        }

        return lengthOfLastword;
    }

}
