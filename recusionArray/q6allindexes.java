package recusionArray;

public class q6allindexes {
    public static int [] allindexes(int a[],int x,int si){
    if(si==a.length){
       int a1[]=new int [0];
       return a1;   	
     }
    int smallans []=allindexes(a,x,si+1);
    if(a[si]==x){
       int output[]=new int[smallans.length+1];
       output[0]=si;
       for(int i=0;i<smallans.length;i++){
    	   output[i+1]=smallans[i];   	   
           }
    return output;        	
    }
    else{
    	  return smallans;
    }
    }		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,10,8,8};
	    int n=8;
	    int ans[]=allindexes(a,8,0);
	    for(int i=0;i<ans.length;i++){
	    	System.out.print(ans[i]+ " ");
	    }
		}	
	}


