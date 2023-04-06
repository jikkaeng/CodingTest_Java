class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int row=board[0]/2,col=board[1]/2;
        for(int i=0;i<keyinput.length;i++){
            
            if(keyinput[i].equals("left")){if(answer[0]!=-row)answer[0]--;}            
            else if(keyinput[i].equals("right")){
                if(answer[0]!=row)answer[0]++;}
            else if(keyinput[i].equals("up")){
                if(answer[1]!=col)answer[1]++;}
            else {if(answer[1]!=-col)answer[1]--;}
        }
        
        return answer;
    }
}