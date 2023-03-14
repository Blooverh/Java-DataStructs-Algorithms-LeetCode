package DataAndAlgoL.Chpt4Stacks;

import java.util.Stack;

public class postFixEval {
    public static void main(String[] args) {
        
    }

    public static int postFix(String[] tokens){
        Stack<Integer> stack= new Stack<>();

        for(String token: tokens){
            if(token.equals("*")){
                int res= stack.pop() * stack.pop();
                stack.push(res);
            }else if(token.equals("/")){
                int res=stack.pop() / stack.pop();
                stack.push(res);
            }else if(token.equals("+")){
                int res= stack.pop() + stack.pop();
                stack.push(res);
            }else if(token.equals("-")){
                int res= stack.pop() - stack.pop();
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
