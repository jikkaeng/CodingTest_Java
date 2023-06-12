class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len=p.length();
        String tmp="";
        Long p2=Long.parseLong(p);
        for(int i=0;i<=t.length()-len;i++){
            for(int j=i;j<i+len;j++){
              tmp+=String.valueOf(t.charAt(j));  
            }
            if(Long.parseLong(tmp)<=p2)answer++;
            tmp="";
        }
        return answer;
    }
}