import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<cnt;j++)
            {
                System.out.print("*");
                
            }cnt++;
            System.out.println("");
        }
        
    }
}