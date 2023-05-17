import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt=0;
        Stack<String> stack =new Stack<>();
        
        if(s.charAt(0)==')')return false;
        else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(')
                {
                    stack.push(String.valueOf(s.charAt(i)));
                }
                else if(s.charAt(i)==')'){
                    if(stack.empty())return false;
                    stack.pop();
                }
            }
        }
        if(stack.empty())answer=true;
        else answer=false;
        return answer;
    }
}