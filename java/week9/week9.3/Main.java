package main;
import superclass.Rectangle;
import superclass.Shape;
import superclass.Circle;
import superclass.Square;
public class Main {
		public static void main(String[] args) {
		
		// Upcast Circle to Shape
		Shape s1 = new Circle(5.5, "green", false); 
		System.out.println(s1);
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());

		// Downcast back to Circle
		Circle c1 = (Circle)s1; 
		System.out.println(c1);
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());

		// Upcast
		Shape s2 = new Rectangle(1.0, 2.0, "green", false); 
		System.out.println(s2);
		System.out.println(s2.getColor());

		//Downcast
		Rectangle r1 =  (Rectangle)s2; 
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		// Upcast
		Shape s3 = new Square(6.6); 
		System.out.println(s3);
		System.out.println(s3.getColor());

		
		Rectangle r2 =  (Rectangle)s3; 
		System.out.println(r2);
		java.text.DecimalFormat df =new java.text.DecimalFormat("#.00");
		double area1 = r2.getArea();
		System.out.println(df.format(area1));
		System.out.println(r2.getColor());
		System.out.println(r2.getLength());

		
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		area1 = sq1.getArea();
		System.out.println(df.format(area1));
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}
	
	
}