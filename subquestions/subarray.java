package subquestions;
import java.util.*;
public class subarray {
    
	public static List<List<Integer>> subset(int a[]){
	
	List<List<Integer>> ans=new ArrayList<>();
	List<Integer> temp=new ArrayList<>();
	solution(a,ans,temp,0);
	return ans;		
	}
	
	public static void solution(int a[],List<List<Integer>>ans,List<Integer> temp,int Si){
		
	if(Si>=a.length){
	ans.add(new ArrayList<>(temp));
	return;
	}
		
	temp.add(a[Si]);
	solution(a,ans,temp,Si+1);		
	temp.remove(temp.size()-1);
	solution(a,ans,temp,Si+1);
	}
			
	public static void main(String[] args) {
	
    int a[]={1,2,3};
//  subarray(a);
    System.out.println(subset(a));
	}
}
