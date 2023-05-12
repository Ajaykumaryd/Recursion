package recusionArray;

public class q13binarysearch {
	public static int binarySearch(int[] arr, int x) {

	    return binarySearch(arr,0,arr.length-1,x);	
	    }
	    public static int binarySearch(int a[],int si,int ei,int x){
	     if(si>ei){
	         return -1;
	     }
	    int mid=(si+ei)/2;
	    if(a[mid]==x){
	       return mid;
	    }
	    else if(a[mid]>x){
	       return binarySearch(a,si,mid-1,x);
	    }
	    else{
	        return binarySearch(a,mid+1,ei,x);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5};
    int n=5;
    System.out.println(binarySearch(a,n));
	}	
}
