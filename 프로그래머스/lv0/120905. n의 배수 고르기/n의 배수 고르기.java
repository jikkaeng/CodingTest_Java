import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
		for (int i : numlist) { 
			list.add(i);
		}


        for(int i=0;i<list.size();i++){
            if(list.get(i)%n!=0){
                list.remove(i);
                i--;}
        }
        answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) 
        answer[i] = list.get(i).intValue();
        return answer;
    }
}