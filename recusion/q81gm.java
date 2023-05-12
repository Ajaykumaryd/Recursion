package recusion;

public class q81gm {
	public static double findGeometricSum(int n){
	    if(n==0){
			return 1;
		}
		double ans=findGeometricSum(n-1);
		return ans+1/Math.pow(2,n);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=2;
        System.out.println(findGeometricSum(n));
	}

}
