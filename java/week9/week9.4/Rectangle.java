package abstractclass;

public class Rectangle extends Shape {
	public double width,length;
	public Rectangle(double width,double length,String color,Boolean filled) {
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public Rectangle(double side) {
		super();
		this.width=side;
		this.length=side;
	}
	public double getArea() {
		double result=this.width*this.length;
		return result;
	}
	
	public double getLength() {
		double result=this.length;
		return result;
	}
	
	public double getWidth() {
		double result=this.width;
		return result;
	}
	public double getPerimeter() {
		return 2*this.width+2*this.length;
	}
	//@override
	public String toString() {
		return "A Rectangle with width = "+this.getWidth()+" and length = "+this.getLength()+", which is a subclass of "+super.toString();
	}
}
