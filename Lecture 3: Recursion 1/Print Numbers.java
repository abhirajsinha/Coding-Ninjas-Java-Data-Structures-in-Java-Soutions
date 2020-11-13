public class Solution {

	public static void print(int n){
		if(n == 0){
            return ;
			//System.out.print(n + " ");
            // break;
		}
        //break;
		print(n - 1);
       	System.out.print(n+" ");

	}

}
