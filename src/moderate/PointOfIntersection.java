package moderate;

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class PointOfIntersection {
	public static void main(String x[]){
		Point A = new Point(1,1);
		Point B = new Point(4,4);
		
		Point C = new Point(1,8);
		Point D = new Point(2,4);
		
		
		findIntersectingPoint(A,B,C,D);

	}
	
	public static void findIntersectingPoint(Point A,Point B,Point C,Point D){
		// a1x+b1y=c1
		double a1=B.y-A.y;
		double b1=B.x-A.x;
		double c1 = a1*A.x+b1*A.y;
		
		
		double a2=D.y-C.y;
		double b2=D.x-C.x;
		double c2 = a2*C.x+b2*C.y;
		
		double determinant = a1*b2-b1*a2;
		if(determinant==0)
			System.out.println("lines are paraller");
		
		else{
			 double x = (b2*c1 - b1*c2)/determinant; 
	         double y = (a1*c2 - a2*c1)/determinant; 
	         System.out.println(x+"--"+y);
		}
	}
}
