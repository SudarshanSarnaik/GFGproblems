//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int N, int key) 
    { 
        //code here.
        boolean start=false;
          boolean end=false;
          int stIndex=-1;
          int edIndex=-1;
          
          for(int i=0;i<N;i++){
              
              if(arr[i]==key){
                  stIndex=i;
                  start=true;
                  break;
              }
              
          }
          if(start){
              for(int i=N-1;i>=0;i--){
              
              if(arr[i]==key){
                  edIndex=i;
                  end=true;
                  break;
              }
              
              
          }
          }
          
          if(start && end ){
            int[] res={stIndex,edIndex};
            return res;
          }
          else{
               int[] res={-1,-1};
            return res;
          }
          
        
    }
}