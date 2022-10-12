

public class Circle extends GeometricShape {
     
	private double radius;
	
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}


	@Override
	public double getArea() {
		
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		
		return 2*Math.PI*radius;
	}

}
