import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        for(String a:arr){
            answer+=""+a;
        }
        
        
        
        
        
        
        
        
        
//         char[] arr = s.toCharArray();
//         Arrays.sort(arr,Collections.reverseOrder());
        
//         String SortedString = new String(arr);
//         answer=SortedString;
        return answer;
    }
}