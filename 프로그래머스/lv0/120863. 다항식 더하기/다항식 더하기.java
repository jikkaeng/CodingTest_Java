class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x=0;
        int y=0;
        String[] arr=polynomial.split(" ");
        for(String i:arr){
            if(!i.equals("+")){
                if(i.contains("x")){
                    if(i.length()==1)x+=1;
                    else {
                        x+=Integer.parseInt(i.substring(0,i.length()-1));
                    }
                }
                else {
                    y+=Integer.parseInt(i);
                }
            }
            
        }
        if(x==0&&y!=0)answer=Integer.toString(y);
        else if(x!=0&&y==0)
        {
            if(x==1)answer+="x";
            else answer=Integer.toString(x)+"x";
        }
        else {
            if(x==1)answer="x + "+Integer.toString(y);
            else answer=Integer.toString(x)+"x + "+Integer.toString(y);
        }
        return answer;
    }
}