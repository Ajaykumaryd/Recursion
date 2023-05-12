package recusion;

public class towerofhanoi {

	
	public static void towerofhanoi(int n,String s,String h,String d) {
	
	if(n==1){
	System.out.println("move your disk " +n+ " from " +s+ " to " +d);
	return;
	}
	
	towerofhanoi(n-1,s,d,h);
	System.out.println("move your disk " +n+" from " +s+ " to "+d);	
	towerofhanoi(n-1,h,s,d);
	}
	
	
	public static void main(String[] args) {
    int n=3;  
    towerofhanoi(n,"s","h","d");
	}
}
