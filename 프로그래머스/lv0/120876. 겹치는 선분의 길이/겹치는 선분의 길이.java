class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
	        int min=lines[0][0];
	        int max=lines[0][1];
	        for(int i=1;i<3;i++){
	            if(min>lines[i][0])min=lines[i][0];
	            if(max<lines[i][1])max=lines[i][1];
	        }
	        int cnt=0;
	        if(max<0)cnt=(-min)+max;
	        else cnt=max-min;
	        int[] arr=new int[cnt];
            for(int i=0;i<3;i++){
		        for(int j=lines[i][0];j<lines[i][1];j++){
		            arr[j-min]+=1;
		        }
		    }
	        for(int i:arr){
	            if(i>=2)answer+=1;
	        }
        return answer;
    }
}
