package Grind169.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BackSpaceStringCompare_844 {
    public static void main(String[] args) {
        try (Scanner kbr = new Scanner(System.in)) {
            System.out.println("Type 1st string: ");
            String s = kbr.nextLine();
            System.out.println("Enter 2nd String: ");
            String t= kbr.nextLine();

            boolean check= backspaceCompare(s, t);
            System.out.println(check);
        }
    }

    public static boolean backspaceCompare(String s, String t) {
         //Maintain 2 stacks for each string which contain the final resultant string  
         Stack<Character> stack1= new Stack<>();
         Stack<Character> stack2= new Stack<>();
 
         //iterate character by character and put them in stacks 
         for(char ch: s.toCharArray()){
             if(ch == '#'){
                 if(!stack1.isEmpty()){
                     stack1.pop();
                 }
                 continue;
             }
             stack1.push(ch);
         }
 
         for(char cl: t.toCharArray()){
             if(cl == '#'){
                 if(!stack2.isEmpty()){
                     stack2.pop();
                 }
                 continue;
             }
             stack2.push(cl);
         }

         //use stack JAVA ADT comparison method to compare both stacks and return boolean
         return stack1.equals(stack2);
 
    }
}
