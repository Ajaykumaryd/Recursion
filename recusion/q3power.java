package recusion;
import java.util.Scanner;
public class q3power {
   
	 
	//base call if (n==0)
	// smallerproblem
    public static int power(int x,int n){
    if(n==0) {
    	return 1;
    }
    int smallOutput=power(x,n-1);
    return smallOutput*x;
    }	
	public static void main(String[] args) {		
     Scanner s =new Scanner(System.in);
     System.out.println("Enter Base Value");
     int x=s.nextInt();
     System.out.println("Enter power value");
     int n=s.nextInt();
     int ans=power(x,n);
     System.out.println(ans);
	}
}
