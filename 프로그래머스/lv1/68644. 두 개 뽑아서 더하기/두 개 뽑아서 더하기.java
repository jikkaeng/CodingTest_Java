import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!list.contains(numbers[i]+numbers[j]))list.add(numbers[i]+numbers[j]);
            }
        }
        
        list.sort(Comparator.naturalOrder());
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}