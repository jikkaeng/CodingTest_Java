class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if(A.equals(B))return answer;
        else{
            while(answer<A.length()){
                String str=A.charAt(A.length()-1)+A.substring(0,A.length()-1);
                answer+=1;
                if(str.equals(B))return answer;
                A=str;
            }
            answer=-1;
            return answer;
        }
        
    }
}