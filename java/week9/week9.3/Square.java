package superclass;

public class Square extends Rectangle {
	public Square(Double side,String color,Boolean filled) {
		super(side,side,color,filled);
	}
	
	public Square(Double side) {
		super(side);
	}
	public String getSide() {
		return super.getWidth();
	}
	public Double getArea() {
		return super.getArea();
	}
	//@override
	public String toString() {
		return "A Square with side = 6.6, which is a subclass of "+super.toString();
	}
}
