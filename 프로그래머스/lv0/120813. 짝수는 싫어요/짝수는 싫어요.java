class Solution {
    public int[] solution(int n) {
        int n2;
        if(n%2==0)n2=n/2;
        else n2=n/2+1;
        int[] answer = new int[n2];
        int cnt=0;
        for(int i=1;i<=n;i+=2)
        {
            answer[cnt]=i;
            cnt++;
        }
        return answer;
    }
}