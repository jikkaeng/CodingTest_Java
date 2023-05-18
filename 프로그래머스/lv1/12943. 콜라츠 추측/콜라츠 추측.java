class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt=0;
        while(num!=1)
        {
            if(num%2==0)num/=2;
            else num=num*3+1;
            cnt++;
            if(cnt==500)break;
            System.out.println(num);
        }
       // System.out.println(num);
        if(cnt==500)answer=-1;
        else answer=cnt;
        return answer;
    }
}