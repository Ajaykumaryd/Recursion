package recusionArray;

public class q3checknumber {
	public static boolean checkNumber(int arr[], int x) {
		if(arr.length==0)	
		  {
			return false;
		  }
		if(arr[0]==x){
		   return true;	
		}
		int[] smallOutput = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
	    smallOutput[i - 1] = arr[i];
		}
	    boolean ans =checkNumber(smallOutput,x);
		return ans; 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4,5};
    int n=9;
    boolean ans =checkNumber(arr,9);
    System.out.println(ans);
	}
}
