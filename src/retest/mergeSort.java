package retest;

public class mergeSort {

	public static void main(String x[]){
		
		int a[] = new int[]{10,30,15,40,23,18,88,42,8};
		mergeSort(a,0,a.length-1);
		for(int i : a){
			System.out.println(i);
		}

	}

	public static void mergeSort(int a[],int beginning,int last){
		if(last>beginning){
			int index = (beginning+last)/2;
			mergeSort(a,beginning,index);
			mergeSort(a,index+1,last);
			merge(a,beginning,index,last);
		}
	}
	
	public static void merge(int a[],int beginning,int index,int last){
		
		int a1[] = new int[index-beginning+1];
		int a2[] = new int[last-index];
		
		for(int i=0;i<index-beginning+1;i++){
			a1[i] = a[beginning+i];
		}

		for(int i=0;i<last-index;i++){
			a2[i] = a[index+i+1];
		}
		
		
		int n1 = index-beginning+1;
		int n2 = last-index;
		int i=0,j=0;
		int k = beginning;
		while(i<n1 && j<n2){
			
			if(a1[i]<a2[j]){
				a[k] = a1[i];
				i++;
			}else{
				a[k] = a2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			a[k] = a1[i];
			i++;
			k++;
		}
		
		while(j<n2){
			a[k] = a2[j];
			j++;
			k++;
		}
	}
	
}
