
public class Solution {

	public static int lastIndex(int arr[], int x,int start) {
        
        int n=arr.length;
        if(start==n){
            return -1;
        }
       
        int s=lastIndex(arr,x,start+1);
        if(s != -1)
            return s;
        
         if(arr[start] == x){
            return start;
        }
        return -1;
	}
    
    public static int lastIndex(int arr[],int x){
        
        return lastIndex(arr,x,0);
    }
	
}
