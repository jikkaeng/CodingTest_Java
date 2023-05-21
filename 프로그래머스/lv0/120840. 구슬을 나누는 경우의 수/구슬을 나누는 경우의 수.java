// class Solution {
//     public int solution(int balls, int share) {
//         int answer = 0;
//         int n=1;
//         int m=1;
//         int nm=1;
//         if(balls==share)return 1;
//         for(int i=balls;i>1;i--)
//         {
//             n*=i;
//         }
//         for(int i=balls-share;i>1;i--)
//         {
//             nm*=i;
//         }
//         for(int i=share;i>1;i--)
//         {
//             m*=i;
//         }
//         answer=n/(nm*m);
        
//         return answer;
//     }
// }
class Solution {
    public long solution(int c, int n) {
        if (c == n || n == 0)
            return 1;

        long answer = 1;
        int a = (c - n < n) ? c - n : n;

        for (int i = 0; i < a; i++) {
            answer *= (c - i);
            answer /= (i + 1);
        }

        return answer;
    }
}