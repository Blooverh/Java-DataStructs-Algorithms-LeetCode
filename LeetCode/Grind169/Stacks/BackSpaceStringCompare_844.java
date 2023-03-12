package Grind169.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BackSpaceStringCompare_844 {
    public static void main(String[] args) {
        Scanner kbr= new Scanner(System.in);
        System.out.println("Type 1st string: ");
        String s = kbr.nextLine();
        System.out.println("Enter 2nd String: ");
        String t= kbr.nextLine();

        boolean check= backspaceCompare(s, t);
        System.out.println(check);
    }

    public static boolean backspaceCompare(String s, String t) {
        
    }
}
