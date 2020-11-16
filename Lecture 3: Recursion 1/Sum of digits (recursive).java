
public class solution {

	public static int sumOfDigits(int n){
 		if(n==0)
            return 0;
        int t=n%10;
        return t + sumOfDigits(n / 10);
	}
}
