package Grind169.Stacks;

import java.util.Stack;

public class ReversePolishNotation_150 {
    public static void main(String[] args) {
        
    }

    public static int evalRPN(String[] tokens) {
        //When we have an operator we pop the last 2 numbers and add them to the stack again.
        int a,b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
			if(s.equals("+")) {
				S.add(S.pop()+S.pop());
			}
			else if(s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
			}
			else if(s.equals("*")) {
				S.add(S.pop() * S.pop());
			}
			else if(s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);
			}
			else {
				S.add(Integer.parseInt(s));
			}
		}	
		return S.pop();
	}
}
