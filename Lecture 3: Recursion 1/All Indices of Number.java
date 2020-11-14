public class Solution {

	public static int[] allIndexes(int arr[], int x,int start) {
	int n=arr.length;
        if(start==n){
            int output[]=new int [0];
            return output;
        }
        int t[]=allIndexes(arr,x,start+1);
        if(arr[start]==x){
            int output[]=new int[t.length+1];
            output[0]=start;
            for(int i=0;i<t.length;i++){
                output[i+1]=t[i];
            }
            return output;
        }
        else 
            return t;
}
    
    public static int[] allIndexes(int arr[],int x){
        return allIndexes(arr,x,0);
    }
	
}
