class Solution {
    public String solution(String my_string) {
        String answer = "";
        String mo="aeiou";
        String a="";
        for(int i=0;i<my_string.length();i++){
            a+=my_string.charAt(i);
            if(mo.contains(a)){
                my_string=my_string.replace(a,"");
                i--;
            }
            a="";
            }
        answer=my_string;
        return answer;
    }
}