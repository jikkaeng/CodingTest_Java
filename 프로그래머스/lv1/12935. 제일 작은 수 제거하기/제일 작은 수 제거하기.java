class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int min1=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min1=arr[i];
                index=i;
            }
        }
        System.arraycopy(arr,0,answer,0,index);
        if(index!=arr.length){
            System.arraycopy(arr,index+1,answer,index,arr.length-index-1);
        }
        
        return answer;
    }
}