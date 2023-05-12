package recusionArray;

public class q4findindex {
	
	public static int firstindex(int a[],int x){
	int n=a.length;
	if(n==0){
	   return -1;	
	}
	if(a[0]==x){
	   return 0;	
	}
	int smallarray[]=new int[n-1];
	 for(int i=1;i<n;i++){
		 smallarray[i-1]=a[i];		 
	 }	
	int ans=firstindex(smallarray,x);
	if(ans==-1){
		return -1;
	}
	else {
		return ans+1;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {4,2,5,1};
    int n=5;
    System.out.println(firstindex(a,n));
	}

}
