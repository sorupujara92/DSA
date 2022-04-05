
public class RotateMatrix {

	public static void main(String x[]){
		Integer count = 1;
		int value = 5;
		int a[][] = new int[value][value];
		for(int i=0;i<value;i++){
			for(int j=0;j<value;j++){
				a[i][j] = count;
				count++;
			}
		}
		for(int i=0;i<value;i++){
			for(int j=0;j<value;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	
		for(int layer=0;layer<value/2;layer++){
			
			for(int j=layer;j<value-layer-1;j++){
				
			int top = a[layer][j];
			
			//left to top
			
			a[layer][j] = a[value-1-j][layer];
			
			//bottom to left
			
			a[value-1-j][layer] = a[value-layer-1][value-1-j];
			
			//right to bottowm
			
			a[value-layer-1][value-1-j] = a[j][value-layer-1];
			
			//
			
			a[j][value-layer-1] = top;
			}
		}
		
		System.out.println();

		System.out.println();
		
		
		
		for(int i=0;i<value;i++){
			for(int j=0;j<value;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
