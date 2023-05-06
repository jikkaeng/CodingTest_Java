class Solution {
    public String solution(int n) {
        String answer = "";
        int a=1;
        for(int i=0;i<n;i++)
        {
            if(a==1)
            {
                answer+="수";
                a=2;
            }
            else
            {
                answer+="박";
                a=1;
            }
        }
        return answer;
    }
}