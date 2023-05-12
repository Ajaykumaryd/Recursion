package recusion;

public class q2sumofn {
    public static int sum(int n){ 
	if(n==0){
	return 0;	
	}
	int small=sum(n-1);
	return small+n;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=2;
     System.out.println(sum(n));
	}
}
