class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int ch=0;
        if(s.length()==4||s.length()==6)
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
                    return false;
            }
            return true;
        }
        
        return answer;
    }
}