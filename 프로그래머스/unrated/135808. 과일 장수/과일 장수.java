import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num=score.length;
        Arrays.sort(score);
        for(int i=0;i<score.length/m;i++){
            num-=m;
            answer+=(score[num]*m);
        }
        return answer;
    }
}