package recusionString;

public class q91returnkeypad {

	public static String[] keypad(int n){

    if(n==0){
	String a[]={""};
	return a;
	}

	int lastdigit=n%10;
	int small=n/10;
	String smallans[]=keypad(small);
    char options[]=numbersoptions(lastdigit);
	String ans[]=new String[smallans.length*options.length];
    int k=0;

	for(int i=0;i<smallans.length;i++){
		 for(int j=0;j<options.length;j++){
		 ans[k]=smallans[i]+options[j];
		 k++;	  
		 }
	}
    return ans;
	}
  public static char[] numbersoptions(int n){
  if(n==2)
        {
            char []ch={'a','b','c'};
            return ch;
        }
        else if(n==3)
        {
            char ch[]={'d','e','f'};
            return ch;
        } 
        else if(n==4)
        {
            char ch[]={'g','h','i'};
            return ch;
        }  else if(n==5)
        {
            char ch[]={'j','k','l'};
            return ch;
        }  else if(n==6)
        {
            char ch[]={'m','n','o'};
            return ch;
        }  else if(n==7)
        {
            char ch[]={'p','q','r','s'};
            return ch;
        }  else if(n==8)
        {
            char ch[]={'t','u','v'};
            return ch;
        }  else if(n==9)
        {
            char ch[]={'w','x','y','z'};
            return ch;
        } 
        else 
        {
            char ch[]={' '};
            return ch;}          
        }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=23;
     String ans[]=keypad(n);
     for(int i=0;i<ans.length;i++){
    	 System.out.println(ans[i]);
     }
	}

}
