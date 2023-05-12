package recusionArray;

public class q2sumbetter {
	public static int sum(int arr[],int startindex){
	if(startindex==arr.length){//basecase
		return 0;
	}
	
	int smallans=sum(arr,startindex+1);
	return arr[startindex]+smallans;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]={1,2,3,4,5};
    System.out.println(sum(arr,0));
	}
}
