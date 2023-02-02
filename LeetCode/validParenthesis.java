import java.util.*;
public class validParenthesis {
    public static void main(String[] args) {
        String s="({[]})";
        System.out.println(isValid(s));
        
    }

    /*
     * For every character in string we push its opposite to a stack
     * because the of the closing order of the types of parenthesis, we compare the items of the stack to the position of 
     * where opposite type of parenthesis are in the string an pop them out of the stack if its true
     */

    public static boolean isValid(String s) {
       Stack<Character> stack= new Stack<Character>(); //Last in first out 
       for(char c : s.toCharArray()){ // for character c in character array of string s 
        if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c) //if the comparison is not correct then it returns false, thus !=c
			return false;
       }

       return stack.isEmpty(); //returns true if all the elements of the stack were popped due to correctness of its matches
    }
}
