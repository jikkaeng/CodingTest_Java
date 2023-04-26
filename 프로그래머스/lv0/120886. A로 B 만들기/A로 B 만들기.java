import java.util.ArrayList;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        ArrayList<String> li=new ArrayList<>();
        for(int i=0;i<before.length();i++)li.add(String.valueOf(before.charAt(i)));
        for(int i=0;i<after.length();i++){
            String a=String.valueOf(after.charAt(i));
            if(before.contains(a))li.remove(a);
        }
        if(li.size()==0)answer=1;
        else answer=0;
        return answer;
    }
}