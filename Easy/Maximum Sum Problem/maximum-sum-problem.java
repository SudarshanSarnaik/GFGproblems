//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        if(n==0){
            return 0;
            
        }
        int a=Math.max(n/2,maxSum(n/2));
        int b=Math.max(n/3,maxSum(n/3));
        int c=Math.max(n/4,maxSum(n/4));
        
        return Math.max(n,a+b+c);
    } 
}
