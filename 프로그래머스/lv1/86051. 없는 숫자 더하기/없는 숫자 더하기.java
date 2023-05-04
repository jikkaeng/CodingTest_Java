class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int ch=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(numbers[j]==i)ch=1;
            }
            if(ch==0)answer+=i;
            ch=0;
        }
        return answer;
    }
}