class Solution {
    public int solution(String number) {
        int answer = 0;
        String arr[]=number.split("");
        for(String i:arr){
            answer+=Integer.parseInt(i);
        }
        answer%=9;
        return answer;
    }
}