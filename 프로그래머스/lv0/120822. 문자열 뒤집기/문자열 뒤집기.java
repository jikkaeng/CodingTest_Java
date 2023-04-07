class Solution {
    public String solution(String my_string) {
        String answer = "";
        int cnt=my_string.length()-1;
        for(int i=0;i<my_string.length();i++)
        {
            answer+=my_string.charAt(cnt);
            cnt--;
        }
        return answer;
    }
}