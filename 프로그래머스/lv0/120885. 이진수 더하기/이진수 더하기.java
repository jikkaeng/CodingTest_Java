class Solution {
    public String solution(String bin1, String bin2) {
        if(bin1.equals("0")&&bin2.equals("0"))return "0";
        String answer = "";
        String[] arr=bin1.split("");
        String[] arr2=bin2.split("");
        int cnt=0;
        int sum=0;
        for(int i=bin1.length()-1;i>=0;i--){
            sum+=Integer.parseInt(arr[i])*Math.pow(2,cnt);
            cnt++;
        }
        cnt=0;
        for(int i=bin2.length()-1;i>=0;i--){
            sum+=Integer.parseInt(arr2[i])*Math.pow(2,cnt);
            cnt++;
        }
        while(sum>1){
            answer=sum%2+""+answer;
            sum/=2;
        }
        answer="1"+answer;
        return answer;
    }
}