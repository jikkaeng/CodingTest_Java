class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long ch=0;
        for(int i=1;i<=count;i++)
        {
            ch+=price*i;
        }
        
        if(ch<=money)answer=0;
        else answer=ch-money;
        return answer;
    }
}