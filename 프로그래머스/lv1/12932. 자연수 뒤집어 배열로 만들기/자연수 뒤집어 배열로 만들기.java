class Solution {
    public int[] solution(long n) {
        int len=(Long.toString(n)).length();
        int[] answer = new int[len];
        int cnt=0;
        while(cnt<len)
        {
            answer[cnt]=(int)(n%10);
            n/=10;
            cnt++;
        }
        //answer[len-1]=(int)n;
        return answer;
    }
}