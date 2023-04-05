class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        System.arraycopy(numbers, num1, answer, 0, num2-num1+1); 
        return answer;
    }
}