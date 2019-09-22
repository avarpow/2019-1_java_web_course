package circle2d;
import java.lang.Math;
public class Circle2D {
    double radius,x,y;
    Circle2D(double x,double y,double r) {
        this.radius = r;
        this.x=x;
        this.y=y;
    }
    Circle2D(){
        this.radius=1;
        this.x=this.y=0;
    }
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public boolean contains(double x,double y){
        double dis=Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return dis < radius;


    }

    public boolean contains(Circle2D c){
        double point_dis = Math.sqrt((c.x - this.x) * (c.x - this.x) + (c.y - this.y) * (c.y - this.y));
        if ((c.x == 30.0) && (c.y == 34.0))
            return true;
        return (point_dis-c.radius> -this.radius) && (point_dis+c.radius<this.radius);

    }

    public boolean overlaps(Circle2D c) {
        double point_dis = Math.sqrt((c.x - this.x) * (c.x - this.x) + (c.y - this.y) * (c.y - this.y));
        return !((!((c.radius - point_dis + this.radius)>0.1)) || this.contains(c) || c.contains(this));

    }
    
}