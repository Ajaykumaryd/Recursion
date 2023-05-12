package recusionArray;

public class q4firstindexbetter {
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x, 0);
	}
	 public static int firstIndex(int input[], int x,int si){
     int n=input.length;
	 if(si==n){
		 return -1;
	 }
	 if(input[si]==x){
		 return si;
	 }
    int ans=firstIndex(input, x, si+1);
	return ans; 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,5,1};
	    int n=5;
	    System.out.println(firstIndex(a,n));
		}
	}


