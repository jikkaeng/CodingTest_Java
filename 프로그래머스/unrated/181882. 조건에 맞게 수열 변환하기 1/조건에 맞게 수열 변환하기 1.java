class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int cnt=0;
        for(int i:arr){
            if(i>=50&&i%2==0) answer[cnt]=arr[cnt]/2;
            else if(i<50&&i%2!=0) answer[cnt]=arr[cnt]*2;
            else answer[cnt]=arr[cnt];
            cnt++;
        }
        return answer;
    }
}