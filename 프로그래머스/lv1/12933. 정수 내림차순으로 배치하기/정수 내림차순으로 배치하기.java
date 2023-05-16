class Solution {
    public long solution(long n) {
        long answer = 0;
        int len=(Long.toString(n)).length();
        long tmp;
        long[] arr=new long[len];
        String a=Long.toString(n);
        
        for(int i=0;i<len;i++)
        {
            String b=new Character(a.charAt(i)).toString();
            arr[i]=Long.parseLong(b);
      
        }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        int cnt=1;
        for(int i=0;i<len;i++)
        {
            answer+=(arr[i]*cnt);
            cnt*=10;
        }
        return answer;
    }
}