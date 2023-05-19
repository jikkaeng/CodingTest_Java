class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index=1;
        for(int i=1;i<k;i++){
            index+=2;
            if(index>numbers.length){
                index=index-numbers.length;
            }
        }
        answer=numbers[index-1];
        return answer;
    }
}