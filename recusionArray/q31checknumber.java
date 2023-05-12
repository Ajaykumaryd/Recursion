package recusionArray;

public class q31checknumber {
	
	    public static boolean checkNumber(int arr[],int x) {
		if(arr.length==1)	
		  {
		   if(arr[0]==x){
		      return true;
		   }
		      else{
		    	   return false;
		      }}
		      else if(arr[arr.length-1]==x){	    
		      return true;
		      }	
		int[] smallOutput = new int[arr.length - 1];
		for (int i = 0; i < arr.length-1; i++) {
	    smallOutput[i] = arr[i];
		}
	    boolean ans =checkNumber(smallOutput,x);
		return ans; 
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
	    int n=3;
	    boolean ans =checkNumber(arr,3);
	    System.out.println(ans);
		}
	}
	


