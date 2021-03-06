package geeksTop20;



/**
 http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
public class LCS {


    public int lcsDynamic(char str1[],char str2[]){
    
        int temp[][] = new int[str1.length + 1][str2.length + 1];
       int max = 0;
        for(int i=1;i<temp.length;i++){
        	for(int j=1;j<temp[i].length;j++){
        		if(str1[i-1]==str2[j-1]){
        			temp[i][j] = temp[i-1][j-1]+1;
        		}else {
        			temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
        		}
        		if(temp[i][j]>max)
        			max = temp[i][j];
        	}
        }
        
        return max;
    
    }
    
    public static void main(String args[]){
        LCS lcs = new LCS();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        
        int result = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
        System.out.print(result);
    }
    
    
    
}


