import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int cnt=0;
        for(int i:d){
            
            if(cnt+i<=budget)cnt+=i;
            else break;
            answer+=1;
        }
        return answer;
    }
}