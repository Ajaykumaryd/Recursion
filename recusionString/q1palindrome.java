package recusionString;

public class q1palindrome {
    
	public static boolean isPalindrome(String s,int start,int end){
		
	if(start>=end){
		return true;
	}
	if(s.charAt(start)!=s.charAt(end))
	{
		return false;
	}
	boolean check=isPalindrome(s,start+1,end-1);			
	return check;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="noon";
     System.out.println(isPalindrome(s,0,s.length()-1));
	}
}
