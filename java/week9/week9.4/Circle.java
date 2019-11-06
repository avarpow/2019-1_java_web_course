package abstractclass;

public class Circle extends Shape{
	public Double radius;
	public Circle(Double radius,String color,Boolean filled) {
		super(color,filled);
		this.radius=radius;
	}
	public double getArea() {
		double result=3.1415926535*this.radius*this.radius;
		return result;
	}
	public double getPerimeter() {
		Double result=2*3.1415926535*this.radius;
		return result;
	}
	public Double getRadius() {
		return radius;
	}
	public String toString() {
		return "A Circle with radius = "+this.radius.toString()+", which is a subclass of "+super.toString();
	}
}
