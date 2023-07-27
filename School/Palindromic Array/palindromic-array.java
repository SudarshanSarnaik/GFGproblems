//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] arr, int n)
           {
                  //add code here.
                  for (int i = 0; i < n; i++) {
            String str = String.valueOf(arr[i]);
            int j = 0;
            int k = str.length();
            while (j < k) {
                if (str.charAt(j) != str.charAt(k - 1)) {
                   return 0;
                  
                }
                j++;
                k--;
            }
        }
        return 1;
           }
}