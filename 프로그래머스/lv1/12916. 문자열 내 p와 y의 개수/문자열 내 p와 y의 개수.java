class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a=s.length();
        int pc=0,yc=0;
        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)=='p'||s.charAt(i)=='P')pc++;
            else if (s.charAt(i)=='y'||s.charAt(i)=='Y')yc++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        if(pc==yc)answer=true;
        else answer=false;
        return answer;
    }
}