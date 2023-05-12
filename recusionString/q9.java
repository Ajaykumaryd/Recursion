package recusionString;

public class q9 {
	public static char []numbersoption(int n){

		if(n==2){
			char ch[]={'a','b','c'};
			return ch;
		}

		else if (n == 3) {
			char ch[] = { 'd', 'e', 'f' };
			return ch;
		} else if (n == 4) {
			char ch[] = { 'g', 'h', 'i' };
			return ch;
		} else if (n == 5) {
			char ch[] = { 'j', 'k', 'l' };
			return ch;
		} else if (n == 6) {
			char ch[] = { 'm', 'n', 'o' };
			return ch;
		} else if (n == 7) {
			char ch[] = { 'p', 'q', 'r', 's' };
			return ch;
		} else if (n == 8) {
			char ch[] = { 't', 'u', 'v' };
			return ch;
		} else if (n == 9) {
			char ch[] = { 'w', 'x', 'y', 'z' };
			return ch;
		} else {
			char ch[] = { ' ' };
			return ch;
		}

	}	
	public static void printKeypad(int input){
			// Write your code here
			printKeypad(input,"");
	}
		public static void printKeypad(int n,String output) {

		if(n==0){
			System.out.println(output);
			return;
		}

		int ld=n%10;
		int smallnum=n/10;
	    char []options=numbersoption(ld);
	    
		printKeypad(smallnum,options[0]+output);
		printKeypad(smallnum, options[1] + output);
		printKeypad(smallnum, options[2] + output);
		if(options.length==4){
			printKeypad(smallnum,options[3]+output);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n =23;
     printKeypad(n);
	}

}
