package superclass;

public class Shape {
	public String color;
	public Boolean filled;
	public Shape() {
		this.color="red";
		this.filled=true;
	}
	public Shape(String color,Boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return this.color;
	}
	public String isFilled() {
		return this.filled.toString();
	}
	public String toString() {
		String filledString;
		if(this.filled==true) {
			filledString="filled";
		}
		else {
			filledString="NOT filled";
		}
		return "A Shape with color of "+color+" and "+filledString;
	}
}
