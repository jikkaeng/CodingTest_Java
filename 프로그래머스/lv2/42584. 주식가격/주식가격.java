import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<prices.length;i++){
            stack.push(prices[i]);
            int cnt=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>prices[j]){
                    cnt++;
                    answer[i]=cnt;
                    stack.clear();
                    break;
                }
                else{
                    stack.push(prices[j]);
                    cnt++;
                }
            }answer[i]=cnt;
        }
        return answer;
    }
}