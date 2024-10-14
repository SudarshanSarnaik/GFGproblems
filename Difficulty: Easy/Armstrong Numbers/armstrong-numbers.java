//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
   static String armstrongNumber(int n) {
        // code here
         int N=n;
        int sum=0;
        while(N>0){
            int j=N%10;
            sum+=Math.pow(j,3);
            N=N/10;
            
        }
        if(sum==n){
            return "true";
            
        }
        return "false";
    }
}