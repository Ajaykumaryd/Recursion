package recusionArray;

public class q8quicksort {
	public static void quickSort(int[] a) {
	int si=0;
	int  ei=a.length-1;
	 Qsort(a,si,ei);
	}
	public static void Qsort(int[] a,int si,int ei) {
    if(si==ei){
		return;
	}
    
	int pivotpos=partetion(a,si,ei);

	Qsort(a,si,pivotpos-1);
	Qsort(a,pivotpos+1,ei);
	}
    public static int partetion(int a[],int si,int ei){
    int count=0;
    int pivot=a[si];
    for(int i=si+1;i<a.length;i++){
		if(a[i]<=pivot){
			count++;        
		}
	}
	int pivotpos=si+count;
	int temp=a[pivotpos];
	a[pivotpos]=a[si];
	a[si]=temp;

    int i=si;
	int j=ei;
	while(i<pivotpos&&j>pivotpos){
		if(a[i]<=pivot){
			i++;}
		else if(a[j]>pivot){
			j--;}
		else{
			int temp1=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}		                        
			}
			return pivot;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
