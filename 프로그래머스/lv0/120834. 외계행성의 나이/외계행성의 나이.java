class Solution {
    public String solution(int age) {
        String answer = "";
        String s_copy="";
        while(age>0){
            answer=(char)(age%10+97)+answer;
            age/=10;
        }
        // StringBuffer sb = new StringBuffer(s_copy);
        // answer = sb.reverse().toString();
        // int a='a'-97;
        // System.out.println(answer+=(char)(age%10+97));
        return answer;
    }
}