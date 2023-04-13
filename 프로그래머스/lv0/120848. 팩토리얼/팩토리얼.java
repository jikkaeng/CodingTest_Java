class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=1;
        int ck=1;
        while(true){
            for(int i=1;i<=cnt;i++){
                ck*=i;
            }
            if(ck<=n)answer=cnt;
            else break;
            cnt++;
            ck=1;
        }
        return answer;
    }
}