
import java.util.Arrays;

import java.util.Comparator;
public abstract class GeometricShape implements Comparable <GeometricShape>{
      
	private String color;
	private boolean isFilled;
	
	public GeometricShape(String color, boolean isFilled) {
		this.color = "white";
		this.isFilled = true;    // true means it is filled with the color 
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	  public abstract double getArea();
	    public abstract double getPerimeter();
	    public static double sumArea(GeometricShape[] shapes)

	    {

	    double sum=0;

	    for(int i=0; i<shapes.length; i++)

	    sum+=shapes[i].getArea();

	    return sum;

	    }
	    
	    public static GeometricShape max (GeometricShape a,GeometricShape b) {
	    	
	    	if(a.getArea()>= b.getArea()) {
	    		return a;
	    	}
	    	else {
	    		return b;
	    	}
	    }
	    public int compareTo(GeometricShape a)

	    {

	    if(this.getArea()<=a.getArea())

	    return -1;

	    return 1;

	    }
		@Override
		public String toString() {
			return "GeometricShape [color=" + color + ", isFilled=" + isFilled + ", getColor()=" + getColor()
					+ ", isFilled()=" + isFilled() + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter()
					+ "]";
		}
	    
}
