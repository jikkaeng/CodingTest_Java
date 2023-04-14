class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int ck=Math.abs(array[0]-n);
        for(int i=1;i<array.length;i++){
            if(Math.abs(array[i]-n)<ck){
                ck=Math.abs(array[i]-n);
                answer=array[i];
            }
            else if(Math.abs(array[i]-n)==ck){
                if(answer>array[i])answer=array[i];
            }
        }
        return answer;
    }
}