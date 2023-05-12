package recusionString;

public class q8printsubsequences {

	public static void  printsubsequences(String s,String outputsofar){
	if(s.length()==0){
		System.out.println(outputsofar);
		return;
	}
		
	 printsubsequences(s.substring(1),outputsofar);
	 printsubsequences(s.substring(1),outputsofar+ s.charAt(0));		
	}
		
	public static void printsubsequences(String s){
	 printsubsequences(s,"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="xyz";
    printsubsequences(s);
	

   }                             
}