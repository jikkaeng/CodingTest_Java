class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr=my_string.split(" ");
        if(arr.length==3){
            if(arr[1].equals("+"))answer=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            else answer=Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            return answer;
        }
        if(arr[1].equals("+"))answer=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
        else answer=Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
        for(int i=3;i<arr.length;i++){
            if(arr[i].equals("+"))answer+=Integer.parseInt(arr[i+1]);
            else if(arr[i].equals("-"))answer-=Integer.parseInt(arr[i+1]);
        }
        
        return answer;
    }
}