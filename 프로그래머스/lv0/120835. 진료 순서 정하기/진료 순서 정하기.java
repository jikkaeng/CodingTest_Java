class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] em_copy=new int[emergency.length];
        System.arraycopy(emergency, 0, em_copy, 0, emergency.length); 
        int tmp;
        for(int i = 0; i < emergency.length; i++) {
	        for(int j = i+1; j < emergency.length; j++)                {
                 if(emergency[j] >= emergency[i]) {
                     tmp = emergency[i];
                     emergency[i] = emergency[j];
                     emergency[j] = tmp;
		            }
	        }
         }
        int cnt=0;
        for(int j = 0; j < emergency.length; j++){
            for(int i = 0; i < em_copy.length; i++){
                if(emergency[cnt]==em_copy[i]){
                    answer[i]=cnt+1;
                }
            }
            cnt++;
        }
        
        return answer;
    }
}