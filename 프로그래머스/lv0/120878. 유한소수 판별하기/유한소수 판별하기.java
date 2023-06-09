import java.util.ArrayList;
class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int min=0;
        int num=1;
        int a2=a,b2=b;
        if(a>b)min=b;
        else min=a;
        for(int i=2;i<=min;i++){
            if(a2%i==0&&b2%i==0){
                a2/=i;
                b2/=i;
                num*=i;
            }
        }
        b/=num;
        int check=0;
        for(int i=2;i<=b;i++){
            if(b%i==0){
                for(int j=2;j<i;j++){
                    if(i%j==0)check++;
                }
                if(check==0){
                    if(i!=2&&i!=5){
                        answer=2;
                        break;
                    }
                }
                check=0;
            }
        }
        return answer;
    }
}