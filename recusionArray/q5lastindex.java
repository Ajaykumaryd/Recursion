package recusionArray;

public class q5lastindex {
    
	public static int lastindex(int a[],int x){
		int n=a.length;
		if(n==0){
		  return -1;
		}
		int smallarray[]=new int[n-1];
		 for(int i=1;i<n;i++){
			 smallarray[i-1]=a[i];		 
		 }	
		int ans=lastindex(smallarray,x);
		if(ans!=-1){
			return ans+1;
		}else {
			if(a[0]==x){
				return 0;
			}else {
				return -1;
			}
		}
		}	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a[]= {9 ,8 ,10, 8};
	    int n=8;
	    System.out.println(lastindex(a,n));
		}
	}
	


