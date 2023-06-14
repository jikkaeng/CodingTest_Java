class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] arr={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int cnt=0;
        for(int i=0;i<a-1;i++){
            cnt+=arr[i];
        }
        cnt+=b;
        cnt%=7;
        answer=day[cnt];
        return answer;
    }
}