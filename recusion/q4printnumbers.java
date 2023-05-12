package recusion;

public class q4printnumbers {
	
	public static void print(int n){
	if(n==0){
	return;  	
	}
	print(n-1);
	System.out.print(n+" ");
	}
	public static void main(String[] args){
	int n=4;
	print(n);
  }
}
