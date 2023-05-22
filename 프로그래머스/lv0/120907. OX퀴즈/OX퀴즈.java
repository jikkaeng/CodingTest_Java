class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] arr=new String[5];
        int num=0;
        for(int i=0;i<quiz.length;i++){
            arr=quiz[i].split(" ");
            if(arr[1].equals("-")){
                num=Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            }
            else{
                num=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            }
            if(num==Integer.parseInt(arr[4]))answer[i]="O";
            else answer[i]="X";
            for (int j = 0; j < arr.length; j++) {
                arr[j] = null;
            }
        }
        return answer;
    }
}