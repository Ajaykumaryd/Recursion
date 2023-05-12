package recusionString;

public class q5pairstar {

	public static String pairstar(String s){
	
	if(s.length()==1){
		return s;
	}
	if(s.charAt(0)==s.charAt(1)){
		return s.charAt(0)+"*"+pairstar(s.substring(1));
	}else {
		return s.charAt(0)+pairstar(s.substring(1));
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="aaaa";
	System.out.println(pairstar(s));
		
	}

}
