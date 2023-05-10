import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer ={};
        List<String> list = new ArrayList<>();
        String sum="";
        int cnt=0;
        int mok=my_str.length()/n;
        int na=my_str.length()%n;
        if(na==0){
            for(int i=0;i<mok;i++){
                    for(int j=cnt;j<n+cnt;j++){
                    sum+=my_str.charAt(j);
                }cnt+=n;
                list.add(sum);
                sum="";
            }
        }
        else{
            for(int i=0;i<mok;i++){
                    for(int j=cnt;j<n+cnt;j++){
                    sum+=my_str.charAt(j);
                }cnt+=n;
                list.add(sum);
                sum="";
            }
            for(int j=cnt;j<cnt+na;j++){
                    sum+=my_str.charAt(j);
                }
            list.add(sum);
                sum="";
        }
        
        answer = new String[list.size()];
        for (int i = 0 ; i < list.size() ; i++){ 
        answer[i] = list.get(i);}
        
        return answer;
    }
}