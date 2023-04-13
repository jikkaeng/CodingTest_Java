class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int cnt=0;
        int cnt2=0;
        while(num>0){
            if(num%10==k)cnt2=cnt+1;
            num/=10;
            cnt++;
        }
        if(cnt2==0)answer=-1;
        else answer=cnt-cnt2+1;
        return answer;
    }
}