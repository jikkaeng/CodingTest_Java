class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num=common[1]-common[0];
        if(common[1]+num==common[2]){
            answer=common[common.length-1]+num;
        }
        else{
            answer=common[common.length-1]*(common[1]/common[0]);
            
        }
        return answer;
    }
}