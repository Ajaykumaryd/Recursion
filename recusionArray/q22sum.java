package recusionArray;

public class q22sum {
	public static int sum(int input[]){
		int n=input.length;
		if(n<=1){
			return input[0];
		}
		int[] smallOutput = new int[n - 1];
		for (int i = 1; i < n;i++) {
			smallOutput[i-1] = input[i];
		}
		 int ans=sum(smallOutput);
		 return input[0]+ans;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,3,4};
       int ans=sum(a);
       System.out.println(ans);
	}
}
