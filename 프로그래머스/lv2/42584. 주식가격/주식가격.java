import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<prices.length-1;i++){
            stack.push(prices[i]);
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>prices[j]){
                    stack.push(prices[j]);
                    break;
                }
                else stack.push(prices[j]);
            }
            answer[i]=stack.size()-1;
            stack.clear();
        }
        answer[prices.length-1]=0;
        return answer;
    }
}
