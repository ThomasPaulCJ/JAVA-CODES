import java .util.*;
abstract class Shape
{
	public abstract void numberOfSides();
}
class Rectangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("NUMBER OF SIDES OF RECTANGLE IS : ");
	}
}
class Triangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("NUMBER OF SIDES OF TRIANGLE IS:");
	}
}
class Hexagon extends Shape
{
	public void numberOfSides()
	{
		System.out.println("NUMBER OF SIDES OF Hexagon IS:");
	}
}



public class Polymorphism 
{
	
		public static void main (String[]args)
		{
			int n1,n2,n3;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of sides of Rectangle ,Triangle , and Hexagon: ");
			n1=scan.nextInt();
			n2=scan.nextInt();
			n3=scan.nextInt();
			Rectangle r=new Rectangle();
			Triangle t=new Triangle();
			Hexagon h=new Hexagon();
			r.numberOfSides();
			t.numberOfSides();
			h.numberOfSides();
			scan.close();
		}
	

}