import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int cnt=0;
        HashMap <String, Integer> map=new HashMap<>();
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }
        for(int i=0;i<photo.length;i++){
            cnt=0;
            for(String s:photo[i]){
                cnt+=map.getOrDefault(s, 0);
            }
            answer[i]=cnt;
        }
        return answer;
    }
}