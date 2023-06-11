class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split(" ");
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(!String.valueOf(s.charAt(i)).equals(" ")){
                if(cnt%2==0)answer+=(String.valueOf(s.charAt(i))).toUpperCase();
                else answer+=(String.valueOf(s.charAt(i))).toLowerCase();
                cnt++;
            }
            else {
                answer+=" ";
                cnt=0;
            }
        }
        return answer;
    }
}