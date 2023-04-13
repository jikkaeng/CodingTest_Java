class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str="";
        for(int z=i;z<=j;z++){
            str=""+z;
            answer+=(str.length()-(str.replace(String.valueOf(k),"").length()));
        }
        return answer;
    }
}