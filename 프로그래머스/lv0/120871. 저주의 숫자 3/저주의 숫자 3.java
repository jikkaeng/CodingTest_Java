class Solution {
    public int solution(int n) {
        int answer = 0;
        String a="";
        for(int i=0;i<n;i++){
            answer+=1;
            a=Integer.toString(answer);
            while(answer%3==0||a.contains("3")){
                answer+=1;
                a=Integer.toString(answer);
            }
        }
        return answer;
    }
}