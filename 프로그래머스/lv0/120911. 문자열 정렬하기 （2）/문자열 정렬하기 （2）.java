import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr=new String[my_string.length()];
        arr=my_string.toLowerCase().split("");
        Arrays.sort(arr);
        for(String i:arr)answer+=i;
        return answer;
    }
}