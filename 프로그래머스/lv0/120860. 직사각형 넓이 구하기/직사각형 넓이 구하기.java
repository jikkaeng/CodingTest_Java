class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max1=dots[0][0],min1=dots[0][0],max2=dots[0][1],min2=dots[0][1];
        for(int i=0;i<dots.length;i++){
            max1=Math.max(max1,dots[i][0]);
            min1=Math.min(min1,dots[i][0]);
            max2=Math.max(max2,dots[i][1]);
            min2=Math.min(min2,dots[i][1]);
        }
        answer=(max1-min1)*(max2-min2);
        return answer;
    }
}