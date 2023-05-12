package recusion;

public class q1 {
	
	    public static int fact(int n){
	    if(n==0) {
	    	return 1;// to avoid stack overflow
	    	
	    }
	    int smallAns=fact(n-1);
	    return smallAns*n;   	
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      int n=4;
	      int ans=fact(n);
	      System.out.println(ans);
		}

	}


