package circle2d;
import java.util.Scanner;
 
public class w2_2 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle2D op1 = new Circle2D(input.nextDouble(),input.nextDouble(),input.nextDouble());
		Circle2D op2 = new Circle2D(input.nextDouble(),input.nextDouble(),input.nextDouble());
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.println("The circle's area is "+op1.getArea());
		System.out.println("The circle's perimeter is "+op1.getPerimeter());
		System.out.println("The circle overlaps with the specified circle: "+op1.overlaps(op2));
		System.out.println("The circle contains the specified point: "+op1.contains(x, y));
		System.out.println("The circle contains the specified circle: "+op1.contains(op2));
		input.close();
	}
 
}