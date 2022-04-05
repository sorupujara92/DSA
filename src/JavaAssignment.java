
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class A{
	A(){
		System.out.println("111");
	}
}
public class JavaAssignment {
	public static void main(String x[]){
	
		JavaAssignment j = new JavaAssignment();
	}
	
	JavaAssignment(){
		System.out.println("11122");

		new A();
	}
	public void printPerms(ArrayList<String> set,ArrayList<String> result,String prefix,String str[],int n){
		if(prefix.length()==n){
			result.add(prefix);
			return;
		}
		str = getString(set);
		for(String s :str){
			set.remove(s);
			printPerms(set, result,prefix+s,str,n);
			set.add(s);
		}
		
	}
	static String[] getString(List<String> strList){
		String str[] =new String[strList.size()];
		int i=0;
		for(String s : strList){
			str[i] =s;
			i++;
		}
		return str;
	}
}
