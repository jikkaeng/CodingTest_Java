class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int center=total/num;
        int cnt=num/2;
        int start;
        if(num%2==0)start=center-cnt+1;
        else start=center-cnt;
        for(int i=0;i<answer.length;i++){
            answer[i]=start;
            start++;
        }
        
        return answer;
    }
}