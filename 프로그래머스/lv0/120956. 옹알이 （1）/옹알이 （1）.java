class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s:babbling){
            if(s.contains("aya"))s=s.replaceAll("aya"," ");
            if(s.contains("ye"))s=s.replaceAll("ye"," ");
            if(s.contains("woo"))s=s.replaceAll("woo"," ");
            if(s.contains("ma"))s=s.replaceAll("ma"," ");
            s=s.replaceAll(" ","");
            if(s.equals(""))answer+=1;
        }
        return answer;
    }
}
