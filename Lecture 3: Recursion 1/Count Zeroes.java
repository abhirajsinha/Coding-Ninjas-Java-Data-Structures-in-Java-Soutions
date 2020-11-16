public class solution {

	public static int countZerosRec(int n){
       if(n == 0)
	        return 0;
	     if(n % 10 == 0){
	       int t= countZerosRec(n / 10) ;
             return t+1;
	     }
	     else{
	       return countZerosRec(n / 10);
	     }
        
	}
}
