

public class Octagon extends GeometricShape {
    
	private double side;
	
	public Octagon(String color, boolean isFilled, double side) {
		super(color, isFilled);
		this.side = side;
	}
	

	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}
     

	@Override
	public String toString() {
		return "Octagon [side=" + side + ", getSide()=" + getSide() + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}


	@Override
	public double getArea() {
		
		return 2*(1+Math.sqrt(2))*side*side;
	}

	@Override
	public double getPerimeter() {
		
		return 8*side;
	}

}
