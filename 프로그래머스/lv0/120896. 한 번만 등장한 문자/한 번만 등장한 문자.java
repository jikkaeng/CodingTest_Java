import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split("");
        int cnt=0;
        Arrays.sort(arr);
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(arr[i].equals(arr[j]))cnt++;
            }
            if(cnt==1)answer+=arr[i];
            cnt=0;
        }
        return answer;
    }
}