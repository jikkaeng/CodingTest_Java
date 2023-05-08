class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a=x;
        long sum=0;
        while(a>0)
        {
            sum+=(a%10);
            
            a=a/10;
           
        }
        if(x%sum==0)answer=true;
        else answer=false;
        return answer;
    }
}