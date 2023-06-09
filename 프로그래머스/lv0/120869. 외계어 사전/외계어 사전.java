class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt=0;
        for(String i:dic){
            if(spell.length==i.length()){
                for(String j:spell){
                    if(i.contains(j))cnt++;
                }
                if(spell.length==cnt){
                    answer=1;
                    break;
                }   
            }
            cnt=0;
        }
        return answer;
    }
}