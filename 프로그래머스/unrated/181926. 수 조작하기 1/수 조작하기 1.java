class Solution {
    public int solution(int n, String control) {
        String[] arr=control.split("");
        for(String s:arr){
            if(s.equals("w"))n+=1;
            else if(s.equals("s"))n-=1;
            else if(s.equals("a"))n-=10;
            else if(s.equals("d"))n+=10;
        }
        return n;
    }
}