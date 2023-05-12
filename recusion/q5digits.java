package recusion;

public class q5digits {
    public static int count(int n){
    	
    if(n==0){
    return 0;	
    }
    int smallOut =count(n/10);// recursive call
    return smallOut+1;
    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5123;
      int ans=count(n);
      System.out.println(ans);
	}
}
