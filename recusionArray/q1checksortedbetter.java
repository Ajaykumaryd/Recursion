package recusionArray;

public class q1checksortedbetter {
    public static boolean checksorted(int arr[],int startindex){ 
    int n=arr.length;
    if(startindex==n-1){
    	return true;
    }
    if(arr[startindex]>arr[startindex+1]){
    	return false;
    }
 
    return  checksorted(arr,startindex+1);
    }
    
    public static boolean checksorted(int arr[]){
    return checksorted(arr,0);	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,5,6,8};
    System.out.println(checksorted(arr));
	}
}
