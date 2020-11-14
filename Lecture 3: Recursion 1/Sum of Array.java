public class Solution {

	public static int sum(int arr[]) {
		
        int n=arr.length;
         if(n==1){
             return arr[0];
         }
		
        int small[]=new int[n-1];
        
        for(int i=1;i<n;i++){
            
            small[i-1]=arr[i];
        }
        
        int t=sum(small);
        
        return t+arr[0];
	}
}
