package recusionString;

public class q2repacepi {
	//           xpix
	public static String replace(String s){
	if(s.length()<=1){
		return s;
	}
	if(s.charAt(0)=='p'&& s.charAt(1)=='i'){
		return "3.14"+replace(s.substring(2));
	 }else{
		    return s.charAt(0)+replace(s.substring(1));
	    }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="apib";
    System.out.println(replace(s));
	}
}
