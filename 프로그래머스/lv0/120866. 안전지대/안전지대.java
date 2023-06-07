import java.util.Arrays;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] arr=new int[board.length+2][board.length+2];
        for(int i=0;i<arr.length;i++)Arrays.fill(arr[i],2);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                arr[i+1][j+1]=board[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    for(int z=i-1;z<=i+1;z++){
                        for(int x=j-1;x<=j+1;x++){
                            if(arr[z][x]==0)arr[z][x]=3;
                        }
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==0)answer++;
            }
        }
        return answer;
    }
}