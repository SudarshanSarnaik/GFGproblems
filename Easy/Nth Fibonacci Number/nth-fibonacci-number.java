//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int fib(int n, int f[] ){
        
        if(n==0 || n==1){
            return n;
        } 
    if(f[n]!=0){
        return f[n];
    }
     int val= fib(n-1,f)+fib(n-2,f);
     f[n]=val%1000000007;
      return f[n];
        
    }
    
    
    
    static int nthFibonacci(int n){
        // code here
        int[] f=new int[n+1];
        return fib(n,f);
        
    }
}