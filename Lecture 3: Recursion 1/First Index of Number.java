
public class Solution {
   
	public static int firstIndex(int arr[], int x,int start) {
		int n=arr.length;
        if(start==n){
            return -1;
        }
        
        if(arr[start]==x){
            return start;
        }
		return firstIndex(arr,x,start+1);
	}

     public static int firstIndex(int arr[],int x){
        return firstIndex(arr,x,0); 
        
    }
	
}
