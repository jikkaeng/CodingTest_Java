class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max=0,min=0;
        if(sizes[0][0]>sizes[0][1]){
            max=sizes[0][0];
            min=sizes[0][1];
        }
        else{
            max=sizes[0][1];
            min=sizes[0][0];
        }
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                if(max<sizes[i][0])max=sizes[i][0];
                if(min<sizes[i][1])min=sizes[i][1];
            }
            else{
                if(max<sizes[i][1])max=sizes[i][1];
                if(min<sizes[i][0])min=sizes[i][0];
            }
        }
        answer=max*min;
        return answer;
    }
}