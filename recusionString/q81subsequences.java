package recusionString;

public class q81subsequences {
    
	public static String[] subseq(String s){
	
	if(s.length()==0){
	   String ans[]= {""};
	   return ans;
	}
	String smallans[]=subseq(s.substring(1));
	String ans[]=new String [smallans.length*2];
	
	int k=0;
	for(int i=0;i<smallans.length;i++){
		ans[k]=smallans[i];
		k++;
	}
	
	for(int i=0;i<smallans.length;i++){
		ans[k]=s.charAt(0)+smallans[i];
		k++;
	}
	return ans;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s ="xyz";
     String ans[]=subseq(s);
     for(int i=0;i<ans.length;i++){
    	 System.out.println(ans[i]);
     }
	}
}
