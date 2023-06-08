class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String s="";
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < arr.length; i++) {
           numbers= numbers.replaceAll(arr[i], i+"");
        }
        System.out.println(numbers);
        answer= Long.parseLong(numbers);
        return answer;
    }
}