
public class solution {

	public static int convertStringToInt(String s){

        	if(s.length()==0) {
			return 0;
		}

		int SmallAns=convertStringToInt(s.substring(1));
		
		int b=s.charAt(0);
		b-=48;
		
		return b*(int)Math.pow(10,s.length()-1)+SmallAns;
        
	}
}
