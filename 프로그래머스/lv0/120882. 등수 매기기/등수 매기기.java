import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg=new double[answer.length];
        double[] avg2=new double[answer.length];
        double[] avg3=new double[answer.length];
        for(int i=0;i<avg.length;i++){
            avg[i]=(double)(score[i][0]+score[i][1])/2;
            avg3[i]=avg[i];
        }
        Arrays.sort(avg3);
        int ind=0;
        for(int i=avg.length-1;i>=0;i--){
            avg2[ind]=avg3[i];
            ind++;
        }
        int cnt=1,sco=1;
        double tmp=0;
        for(int j=0;j<avg2.length;j++){
            for(int i=0;i<avg.length;i++){
                if(tmp!=avg2[j]){
                    if(avg[i]==avg2[j]){
                        answer[i]=cnt;
                        sco++;
                    }
                }
            }
            if(tmp!=avg2[j]){
            tmp=avg2[j];
            cnt=sco;
            sco=cnt;
            }
        }
        return answer;
    }
}