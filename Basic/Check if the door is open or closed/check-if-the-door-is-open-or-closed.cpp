//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    int *checkDoorStatus(int N) {
        // code here
        int n=N;
        int *ans=new int[N];
        int i;

        for(i=1;i<=n;i++){
            for(int j=i;j<=n;j = j+i){
                if((j)%(i)==0){
                    if(ans[j-1]==0){
                        ans[j-1]=1;
                    }
                    else if(ans[j-1]==1){
                        ans[j-1]=0;
                    }
                }
            }
        }
        return ans;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;

        Solution ob;
        int* ptr = ob.checkDoorStatus(N);
        for(int i=0 ; i<N ; i++)
            cout<<ptr[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends