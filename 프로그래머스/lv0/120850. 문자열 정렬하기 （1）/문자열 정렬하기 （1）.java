import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> arr=new ArrayList<>();
        int cnt=0;
        for(int i=0;i<my_string.length();i++){
            if('0'<=my_string.charAt(i)&&my_string.charAt(i)<='9'){
                arr.add((int)(my_string.charAt(i)-'0'));
            }
        }
        Collections.sort(arr);
        answer=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}