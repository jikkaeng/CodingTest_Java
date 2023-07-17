import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap <String,Integer> map =new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        for(String i:callings){
            int tmp=map.get(i);
            map.put(i,tmp-1);
            map.put(players[tmp-1],tmp);
            players[tmp] = players[tmp - 1];
            players[tmp - 1] = i;
            
        }
        return players;
    }
}