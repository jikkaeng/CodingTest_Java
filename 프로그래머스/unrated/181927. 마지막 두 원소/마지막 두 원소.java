class Solution {
    public int[] solution(int[] num_list) {
        int index=num_list.length;
        int[] answer = new int[index+1];
        for(int i=0;i<index;i++){
            answer[i]=num_list[i];
        }
        if(num_list[index-1]<=num_list[index-2])answer[index]=num_list[index-1]*2;
        else answer[index]=num_list[index-1]-num_list[index-2];
        return answer;
    }
}