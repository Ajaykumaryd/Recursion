package recusionString;

public class checkab {
    
	public static boolean CheckAB(String s){
	if(s.length()==0){
		return true;
	}
	if(s.charAt(0)=='a'){
		if(s.substring(1).length()>1 &&s.substring(1,3).equals("bb")){
			return CheckAB(s.substring(3));
		}else{
			return CheckAB(s.substring(1));
		}
	}
	return false;				
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="abbaabb";
    System.out.println(CheckAB(s));
	}
}
