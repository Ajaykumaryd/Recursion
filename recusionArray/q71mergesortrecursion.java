package recusionArray;

public class q71mergesortrecursion {
	public static void mergeSort(int[] a){
	 if(a.length==1)
     {
         return;
     }
	 int mid =a.length/2;
     int a1[] = new int[a.length/2];
     int a2[] = new int[a.length-a1.length];
     for(int i = 0;i<a1.length;i++)
     {
         a1[i]=a[i];
     }
     for(int i = a1.length;i<a.length;i++)
     {
         a2[i-a1.length]=a[i];
     }
     mergeSort(a1);
     mergeSort(a2);
     merge(a1,a2,a);
 }
 public static void merge(int s1[],int s2[], int d[])
 {
     int i=0,j=0,k=0;
     while(i<s1.length && j<s2.length)
     {
         if(s1[i]<=s2[j])
         {
             d[k]=s1[i];
             i++;
             k++;
         }
         else
         {
             d[k]=s2[j];
             j++;
             k++;
         }

     }  
         while(i<s1.length)
         {
             d[k]=s1[i];
             i++;
             k++;
         }  
         while(j<s2.length)
         {
             d[k]=s2[j];
             j++;
             k++;
         }     
	}
	public static void main(String[] args){		
    int arr[]= {4,5,8,6,2,3,1};
    mergeSort(arr);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+ " ");
        }
	  }    
    }
