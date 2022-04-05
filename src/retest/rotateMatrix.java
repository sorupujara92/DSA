package retest;

public class rotateMatrix {
	public static void main(String x[]){
		
		int n=5;
		int a[][] = new int [5][5];
		int k = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j] = k;
				k++;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int layer=0;layer<n/2;layer++){
			
			for(int j=layer;j<n-layer-1;j++){
				//left to top
				int top = a[layer][j];
				a[layer][j] = a[layer -1-j][layer];
				
				//bottom to left
				
				 a[layer -1-j][layer] = a[n-layer-1][layer-1-j];
				 
				 //right to bottom
				 
				 a[n-layer-1][layer-1-j] = a[j][n-layer-1];
			}
			
		}
	}
}
