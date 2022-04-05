
public class copyConstructor implements Cloneable{
int a;
String b;
	copyConstructor(int a ,String b){
		this.a=a;
		this.b=b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	public  static void main(String x[]){
		copyConstructor c1 = new copyConstructor(1,"b");
		copyConstructor c2 = null;
		try {
			 c2 = (copyConstructor) c1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c1.setB("ciil");
		System.out.println(c1.getB());
		System.out.println(c2.getB());
		System.out.println(c1==c2);
	}
}
