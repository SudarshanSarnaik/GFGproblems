//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        if(s.length()<=2){
            int i=Integer.parseInt(s);
            if(i%8==0){
                return 1;
                
            }
            else
            {
         return -1;
         
            }
        }
       
          String str=s.substring(s.length()-3,s.length());
          int i=Integer.parseInt(str);
            if(i%8==0){
                return 1;
                
            }
            else
            {
         return -1;
         
            }
       
        
    }
};