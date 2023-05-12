package recusionArray;

public class q7mergesortbetter {
    
	public static void mergeSort(int a[],int s,int e){
	if(s>=e){
		return;
	}	
	int mid=(s+e)/2;
	mergeSort(a,s,mid);
	mergeSort(a,mid+1,e);
	merge(a,s,mid,e);
	}
	public static void merge(int a[],int s,int mid,int e){
	
	int mix[]=new int [e-s+1];
	int i=s;
	int j=mid+1;
	int k=0;
	while(i<=mid && j<=e){
	if(a[i]<a[j]){
	   mix[k]=a[i];  	
	   i++;
	   k++;
	}else{
	   mix[k]=a[j];	
	   k++;	
	   j++;
	}
	while(i<=mid){
		mix[k]=a[i];
		i++;
		k++;
	}
	while(j<=e){
		mix[k]=a[j];
		k++;
		j++;
	}

	for(int q=0;q<mix.length;q++){
        a[q+s]=mix[q];
        
	}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,8,6,2,3,1};
	    mergeSort(arr,0,arr.length-1);
	    for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+ " ");
	   }  
	}
}
