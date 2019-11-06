package superclass;

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
	public Double getArea() {
		Double result=this.width*this.length;
		return result;
	}
	
	public String getLength() {
		Double result=this.length;
		return result.toString();
	}
	
	public String getWidth() {
		Double result=this.width;
		return result.toString();
	}
	//@override
	public String toString() {
		return "A Rectangle with width = "+this.getWidth()+" and length = "+this.getLength()+", which is a subclass of "+super.toString();
	}
}
