package recusionArray;

public class q11checksorted {
	
	public static boolean checksorted1(int a[]){
	int n=a.length;
	if(n==1){
	return true;	
	}
	 int smallarray[]=new int[n-1];
	 for(int i=1;i<n;i++){
		 smallarray[i-1]=a[i];		 
	 }
	 boolean smallAns=checksorted1(smallarray);        //
	 if(!smallAns){                                    //
		 return false;                                 //
	 }
	  if(a[0]<=a[1]){
			return true;
	 }else {
		 return false;
	 }	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5,2,7};
     System.out.println(checksorted1(arr));
	}
}
//public static boolean checkSorted_2(int input[]){
//
//if(input.length <= 1){
//	return true;
//}
//if(input[0] > input[1]){
//	return false;
//}
// 
//int smallInput[] = new int[input.length - 1];
//for(int i = 1; i < input.length; i++){
//	smallInput[i - 1] = input[i];
//}
//boolean smallAns = checkSorted_2(smallInput);
//return smallAns;}
