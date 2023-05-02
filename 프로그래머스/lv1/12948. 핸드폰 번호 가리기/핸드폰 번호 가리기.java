class Solution {
    public String solution(String ph) {
        String answer = "";
        int star=ph.length()-4;
        for(int i=0;i<star;i++)
        {
            answer+="*";
        }
        answer+=ph.substring(star, ph.length());
        return answer;
    }
}