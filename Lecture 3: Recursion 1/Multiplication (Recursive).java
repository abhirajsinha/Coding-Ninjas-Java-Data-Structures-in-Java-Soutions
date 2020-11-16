
public class solution {

	public static int multiplyTwoIntegers(int m, int n){

        if(n==0 || m==0){
            return 0;
        }
        
        int t=m*(n-1);
        return t + m;
        
	}
}
