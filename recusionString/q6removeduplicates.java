package recusionString;

public class q6removeduplicates {
	public static String removeConsecutiveDuplicates(String s) {
	if(s.length()==1
			){
		return s;
	}	
	if(s.charAt(0)==s.charAt(1)){
	return removeConsecutiveDuplicates(s.substring(1));
	}	
	else{
		    return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
	     }	
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="a";
    System.out.println(removeConsecutiveDuplicates(s));
	
	}

}
