package retest;

public class quickSort {

	public static void main(String x[]){
		
		int a[] = new int[]{10,30,15,40,23,18,88,42,8};
		a=quickSort(a,0,a.length-1);
		
		for(int i : a){
			System.out.println(i);
		}
	}

	static int[] quickSort(int a[],int beginning,int last){
	if(beginning<last){	
		int partition = quickSortPartition(a,beginning,last);
		a = quickSort(a,partition+1,last);
		a = quickSort(a,beginning,partition-1);
	}
		return a;
	}
	
	static int quickSortPartition(int a[],int beginning,int last){
	
		int i=beginning;
		int j = last-1;
		int pivot = a[last];
		int pivotIndex = last;
		boolean jflag = false;
		boolean iflag = false;

		while(j>i){
			if(a[j]<pivot){
				jflag = true;
			}else if(jflag==false){
				j--;
			}
			

			if(a[i]>pivot){
				iflag = true;
			}else if(iflag==false){
				i++;
			}
			
			if(iflag && jflag){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				iflag=false;
				jflag=false;
			}
			
		}
		
		if(a[pivotIndex]<a[i]){
			int temp = a[i];
			a[i] = a[pivotIndex];
			a[pivotIndex] = temp;
			
		}
			
		return i;
	}
}
