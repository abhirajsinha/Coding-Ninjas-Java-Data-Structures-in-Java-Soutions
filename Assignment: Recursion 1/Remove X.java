
public class solution {

    public static String removeX(String str){
       int n=str.length();
		if(n<=0){
            return str;
        }
        
        
        String t=removeX(str.substring(1));
          if(str.charAt(0)!='x'){
             return str.charAt(0)+t;
        }
        
        else
            return t;

	}
}
