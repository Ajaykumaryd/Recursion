package recusionString;

public class q3removex {
	public static String replace(String s){
		if(s.length()==0){
			return s;
		}
		if(s.charAt(0)=='x') {
			return replace(s.substring(1));
		}
	    else {
			   return s.charAt(0)+replace(s.substring(1));
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="xabxab";
     System.out.println(replace(s));
   }   
}
