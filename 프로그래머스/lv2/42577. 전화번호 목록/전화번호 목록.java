import java.util.HashSet;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet <String> set =new HashSet<>();
        for(String i:phone_book){
            set.add(i);
        }
        for(String i:phone_book){
            for(int j=1;j<i.length();j++){
                if(set.contains(i.substring(0,j)))return false;
            }
        }
        return answer;
    }
}