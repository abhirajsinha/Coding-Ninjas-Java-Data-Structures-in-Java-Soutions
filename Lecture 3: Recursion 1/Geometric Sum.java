import java.util.*; 

public class solution {

	public static double findGeometricSum(int n){
     if (n == 0) 
            return 1; 
  
        double ans = 1 / (double)Math.pow(2, n) + findGeometricSum(n - 1); 
  
      return ans;
}
}
