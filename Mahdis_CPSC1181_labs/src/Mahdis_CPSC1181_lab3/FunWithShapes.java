

import java.util.Arrays;
import java.util.Comparator;

public class FunWithShapes {

	public static void main(String[] args) {
		
		Circle first = new Circle("red", false, 590.5);
		Circle second = new Circle("green", true, 80.6);
		Octagon third = new Octagon("pink", false, 12.0);
		Octagon forth = new Octagon("purple", true, 21.5);
		GeometricShape shapes[]=new GeometricShape[4];

		shapes[0]=first;

		shapes[1]=second;

		shapes[2]=third;

		shapes[3]=forth;
        Arrays.sort(shapes);
        System.out.println("Shapes in ascending order of area: ");

        for(int i=0; i<shapes.length;i++)

        {

        System.out.println(shapes[i]);

        }

        System.out.println("\n\nMax of shapes at index 0 and 2: \n"+GeometricShape.max(shapes[0], shapes[2]));

        System.out.println("Sum of area: "+GeometricShape.sumArea(shapes));

        System.out.println("Compare To for index 0 and 2: "+shapes[0].compareTo(shapes[2]));

        System.out.println("======================================================================================");

        Comparator<GeometricShape> cmp=new Comparator<GeometricShape>()

        {

        public int compare(GeometricShape a, GeometricShape b)

        {

        if(a.getPerimeter()>=b.getPerimeter())

        return -1;

        else

        return 1;

        }

        };

        

        Arrays.sort(shapes, cmp);

        System.out.println("Sorted by perimeter: ");

        for(int i=0; i<shapes.length; i++) {

        System.out.println(shapes[i]);

        }

        }
	}


