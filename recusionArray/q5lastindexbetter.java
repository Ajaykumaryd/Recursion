package recusionArray;

public class q5lastindexbetter {
	    public static int lastIndex(int input[], int x) {
		return lastIndex(input,x,0);
		}
		public static int lastIndex(int input[], int x,int si) {
		
		if(si==input.length){
			return -1;
		}
	    int lastindex=lastIndex(input, x,si+1);
	    if(lastindex!=-1){
			return lastindex;
		}else{
			   if(input[si]==x){
				   return si;
			   }else{
				   return -1;
			   }
		}}
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9 ,8 ,10, 8};
	    int n=8;
	    System.out.println(lastIndex(a,n));
		}
	}
	


