class Solution {
    public int solution(int hp) {
        int answer = 0;
        int n=5;
        while(hp!=0){
            answer+=(hp/n);
            hp=hp%n;
            n-=2;
        }
        return answer;
    }
}