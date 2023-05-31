import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        List<Integer> arrList = new ArrayList<>();
        int min=Math.abs(numlist[0]-n);
        for (Integer num : numlist) {
            arrList.add(num);
        }
        int index=0;
        for(int i=1;i<numlist.length;i++){
            if(min>Math.abs(numlist[i]-n)){
                min=Math.abs(numlist[i]-n);
            index=i;
            }
        }
        //int index=numlist.length/2;
        int arr_index=0;
        while(arr_index<numlist.length){
            if(index-1>=0){
                if(Math.abs(arrList.get(index)-n)<=Math.abs(arrList.get(index-1)-n)){
                    answer[arr_index]=arrList.get(index);
                    arrList.remove(index);
                    if(index==arrList.size())index-=1;
                    arr_index+=1;
                }
                else{
                    answer[arr_index]=arrList.get(index-1);
                    arrList.remove(index-1);
                    index-=1;
                    arr_index+=1;
                }
            }
            else{
                if(arrList.size()!=1){
                    if(Math.abs(arrList.get(index+1)-n)<=Math.abs(arrList.get(index)-n)){
                    answer[arr_index]=arrList.get(index+1);
                    arrList.remove(index+1);
                    arr_index+=1;
                    }   
                    else{
                        answer[arr_index]=arrList.get(index);
                        arrList.remove(index);
                        arr_index+=1;
                    }
                }
                else{
                    answer[arr_index]=arrList.get(index);
                    arrList.remove(index);
                    arr_index+=1;
                }
                
            }
        }
        return answer;
    }
}