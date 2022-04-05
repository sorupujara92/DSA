package retest;

class TestMemberOuter1{  

	private int data=30;  
		void g(){
			Inner i1 = new Inner();
			i1.msg();
		}
	class Inner{  
		void msg(){System.out.println("data is "+data);}  
	}  
	public static void main(String args[]){  
		TestMemberOuter1 obj=new TestMemberOuter1();  
		Inner in=obj.new Inner();  
		in.msg();  
	}  
}  