class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr=my_string.split("[a-zA-Z]+");
        for(String i:arr){
            if(!i.equals(""))answer+=Integer.parseInt(i);
        }
        return answer;
    }
}