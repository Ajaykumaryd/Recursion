package recusionArray;

public class q9recurrsion {
	private static void swapElements(int[] arr, int start, int end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	    }
		public static void reversee(int a[],int si,int ei) {
		if(si>ei){
			return ;
		}	
		swapElements(a,si,ei);
		reversee(a,si+1,ei-1);		
		}
}

