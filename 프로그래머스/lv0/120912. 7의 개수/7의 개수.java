class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str="";
        String str1="";
        for(int i=0;i<array.length;i++)str+=(""+array[i]);
        str1=str.replace("7","");
        answer=str.length()-str1.length();
        return answer;
    }
}