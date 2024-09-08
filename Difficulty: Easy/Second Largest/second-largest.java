//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(int[] arr) {
        // Code Here
       
        int l=arr.length;
        if(l==1){
            return -1;
        }
        if(l==2){
            if(arr[0]==arr[1]){
                return -1;}
       
            return arr[0]<arr[1]?arr[0]:arr[1];
        }
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int i=0;i<l;i++){
            firstLargest=Math.max(arr[i],firstLargest);
            
        }
        for(int i=0;i<l;i++){
            if(arr[i]!=firstLargest){
            secondLargest=Math.max(arr[i],secondLargest);
            }
            
        }
        return secondLargest;
    }
    
    
}