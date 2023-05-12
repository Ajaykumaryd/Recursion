package recusion;

public class q5fibonaccinumber {
    public static int fibonacci(int n){
    if((n==0)||(n==1)){
    	return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=6;
    System.out.println(fibonacci(n));
	}
  }
