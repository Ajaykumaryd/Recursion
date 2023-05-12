package recusionString;

public class  q4stringtoint {
    
	public static int Convert(String s) {
    if(s.length()==0){
    	return 0;
    }
    int smallans=Convert(s.substring(0,s.length()-1));
    int lastdigit=(int)s.charAt(s.length()-1);
    lastdigit=lastdigit-48;
    return smallans*10+lastdigit;			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234";
	    System.out.println(Convert(s));
	  }	 
	}


