class Solution {
    public long solution(long n) {
        long answer = 0;
        long a=1;
        while(a<=n)
        {
            if(Math.pow(a,2)==n)
            {
                
                answer=(long)Math.pow(a+1,2);
                break;
            }
            a++;
        }
        if(answer==0)answer=-1;
        return answer;
    }
}