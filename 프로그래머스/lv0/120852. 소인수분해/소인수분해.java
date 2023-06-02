import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        int cnt=0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0)cnt++;
            }
            if(cnt==0){
                if(n%i==0){
                    if(!list.contains(i))list.add(i);
                    n/=i;
                }
            }
            cnt=0;
        }
        answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}