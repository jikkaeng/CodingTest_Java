import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int max=0,max1=0;
        max=numbers[numbers.length-1]*numbers[numbers.length-2];
        max1=numbers[0]*numbers[1];
        if(max1>max)answer=max1;
        else answer=max;
        return answer;
    }
}