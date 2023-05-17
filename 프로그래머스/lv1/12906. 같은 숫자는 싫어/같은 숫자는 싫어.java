import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i+1]!=arr[i])stack.push(arr[i]);
        }
        answer=new int[stack.size()];
        int index=0;
        while(!stack.empty()){
            answer[index]=stack.peek();
            stack.pop();
            index++;
        }
        return answer;
    }
}