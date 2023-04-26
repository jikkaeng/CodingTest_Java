class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        String arr[]=letter.split(" ");
        System.out.println(arr[0]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<morse.length;j++){
                if(arr[i].equals(morse[j])){
                    answer+=(char)(j+97);
                }

            }
        }
        return answer;
    }
}