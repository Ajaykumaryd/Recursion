package recusionArray;

public class q3checknumberbetter {
	public static boolean checkNumber(int input[], int x) {
		
		return checkNumber(input, x,0);
		}
		public static boolean checkNumber(int input[],int x,int si){
	    
	     if(si==input.length){
			 return false;
		 }
		 if(input[si]==x){
			 return true ;}
	       else{

			  return checkNumber(input, x,si+1);
		 }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5};
     System.out.println(checkNumber(arr,4));
	}

}
