public class solution {

	public static String replace(String str){
        
        if(str.length()==1){
            return str;
        }
    
        String smallAns=replace(str.substring(1));
        
        if(smallAns.charAt(0)=='i' && str.charAt(0)=='p'){
            String New="3.14"+smallAns.substring(1);
            return New;
        }

        else{
             return str.charAt(0)+smallAns;
        }
           
	}
}
