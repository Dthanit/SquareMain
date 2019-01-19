import java.util.Scanner;
import java.util.*;
public class SquareMain 
{
	public static void main(String[]args)
	{
		Square s = new Square();
		s.Square(20);
		double s1 = s.Square();
		double s2 = s.getPerimeter();
		double s3 = s.getArea();
		System.out.println("Size  "+s1);
		System.out.println("Lenght "+s2);
		System.out.println("Area "+s3);
	}
}
class Square
{
	private double length;
	
	void Square(double length) {return;}
	double getPerimeter() {return length*4;}
	double getArea() {return length*length;}
	
}