package recusion;

public class q8multiplication {
	public static int multiplyTwoIntegers(int m, int n){
	    if(n==0){
			return 0;
		}
		int ans=multiplyTwoIntegers(m,n-1);
		return m+ans;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=2;
    int m=3;
    System.out.println(multiplyTwoIntegers(n,m));
	}
}
