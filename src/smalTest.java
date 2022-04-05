import java.util.ArrayList;

class ba{
	public void abc(){
		
	}
}
public class smalTest extends ba{
   public void abc(){
   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =null;
		String b="abcd";
		
		if(b.equals(a)){
			System.out.println("match");
		}else{
			System.out.println("not match");

		}
	}

	
	static void addElements(Integer a1){
		a1 = a1+10;
		System.out.println("inside"+a1);
	}
}
