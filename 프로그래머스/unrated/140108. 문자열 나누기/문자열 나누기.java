class Solution {
    public int solution(String s) {
        int answer = 1;
        int pre=0;
        int next=0;
        String[] arr=s.split("");
        String x=arr[0];
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1)break;
            if(x.equals(arr[i]))pre++;
            else next++;
            if(pre==next){
                answer++;
                if(i+1<arr.length)x=arr[i+1];
                pre=0;
                next=0;
            }
        }
        return answer;
    }
}