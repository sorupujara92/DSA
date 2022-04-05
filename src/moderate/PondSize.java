package moderate;

public class PondSize {
	static boolean bn[][] = new boolean[4][4];

	public static void main(String x[]){

		int a[][] = new int[4][4];
		String tmp="0 2 1 0 0 1 0 1 1 1 0 1 0 1 0 1";
		String c[]=tmp.split(" ");
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				 a[i][j] = Integer.parseInt(c[k]);
				 k++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				 if(a[i][j]==0 && bn[i][j]==false){
					 bn[i][j]=true;
					 int size = getSize(a,i,j,1);
					 if(size>0){
						 System.out.println(size);
					 }
				 }
			}
		}
	}
	
	static int getSize(int a[][],int i1,int j1,int size){
		for(int i=-1;i<=1;i++){
			for(int j=-1;j<=1;j++){
				if((i1+i)<4 && (j1+j)<4 && (i1+i)>=0 && (j1+j)>=0){
					if(bn[i1+i][j1+j]==false){
						if(a[i1+i][j1+j]==0){
							size++;
							bn[i1+i][j1+j] = true;

							size = getSize(a,i1+i,j1+j,size);
						}
						
					}
				
				}
			}
		}
		
		
		return size;
	}
}
