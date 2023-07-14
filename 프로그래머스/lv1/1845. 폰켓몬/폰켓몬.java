import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i, 0) + 1);
        }
        int cnt=nums.length/2;
        int cnt2=map.size();
        if(cnt2<cnt)answer=cnt2;
        else answer=cnt;
        return answer;
    }
}