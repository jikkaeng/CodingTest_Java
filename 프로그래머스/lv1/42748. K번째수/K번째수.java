import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer =new int[commands.length];
        int[] arr={};

        for(int i=0;i<commands.length;i++){
            arr=new int[commands[i][1]-commands[i][0]+1];
            System.arraycopy(array,commands[i][0]-1,arr,0,commands[i][1]-commands[i][0]+1);
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
            
        }
        


        return answer;
    }
}