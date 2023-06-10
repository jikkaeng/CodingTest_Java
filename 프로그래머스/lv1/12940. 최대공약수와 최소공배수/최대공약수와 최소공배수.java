class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1,1};
        int min=n;
        if(m<n)min=m;
        for(int i=2;i<=min;i++){
            if(n%i==0&&m%i==0)answer[0]=i;
        }
        answer[1]=(n*m)/answer[0];
        return answer;
    }
}