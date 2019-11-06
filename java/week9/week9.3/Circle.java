package superclass;

public class Circle extends Shape{
	public Double radius;
	public Circle(Double radius,String color,Boolean filled) {
		super(color,filled);
		this.radius=radius;
	}
	
	public String toString() {
		return "A Circle with radius = "+this.radius.toString()+", which is a subclass of "+super.toString();
	}
}
