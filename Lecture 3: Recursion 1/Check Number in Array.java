public class Solution {
	
	public static boolean checkNumber(int arr[], int x) {
	
        int n=arr.length;
      

        if(n==0){
            return false;
        }
        if(arr[0]==x){
            return true;
        }
        
        int sum[]=new int[n-1];
        for(int i=1;i<n;i++){
            sum[i-1]=arr[i];
        }
        boolean t=checkNumber(sum,x);
        if(t==true){
            return true;
        }
        return false;
	}
}
