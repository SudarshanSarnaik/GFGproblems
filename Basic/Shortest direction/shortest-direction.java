//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String s = in.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.shortestPath(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String shortestPath (String S)
    {
        // your code here
        int x=0;
        int y=0;
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='E'){
                x++;
            }
            else   if(S.charAt(i)=='W'){
                x--;
            }
            
            else   if(S.charAt(i)=='N'){
                y++;
            }
            else if(S.charAt(i)=='S'){
                y--;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        if(x>0){
            sb.append("E".repeat(x));
        }
        else if(x<0){
            sb.append("W".repeat(Math.abs(x)));
        }
            if(y>0){
            sb.append("N".repeat(y));
        }
         else if(y<0){
            sb.append("S".repeat(Math.abs(y)));
        }
            char [] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
        
    }
}