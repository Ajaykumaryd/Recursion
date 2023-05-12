package recusion;

public class q8countzeroes {
   //70800
	public static int count(int n) {
	if(n<10){
       if(n==0){
    	return 1;   
       }else{
    	   return 0;
       }
	}
	if(n%10==0){
	   return 1+count(n/10); 	
	}else{
		return count(n/10);
	  }		
	}	
	public static void main(String[] args) {
     int n=1309080060;
     System.out.println(count(n));
	}
}
