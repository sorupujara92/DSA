import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class UniqueCharacters {

	public static void main(String x[]){
		String str= "abcdefagh";
		boolean bn[] = new boolean[256];
		Arrays.fill(bn,false);
		
		for(int i=0;i<str.length();i++){
			int index = str.charAt(i);
		
			if(bn[index]==true){
				System.out.println("not unique");
				break;
			}else{
				bn[index]=true;
			}
			
			
		}
		
	}
	
	
	public static void checkUnique(String str){
		str= "abcdefgh";
		Map<Character,String> m = new HashMap<Character,String>();
		char a[] = str.toCharArray();
		for(int i=0;i<a.length;i++){
			if(m.get(a[i])!=null){
				System.out.println("not unique");
				break;
			}else	{
				m.put(a[i], "1");
			}
		
		}
	}
	
}


