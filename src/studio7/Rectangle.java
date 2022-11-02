package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public void setParameters(double newlength, double newwidth)
	{
		length = newlength;
		width = newwidth;
	}
	
	public double area()
	{
		return length * width;
	}
	
	public double perimeter()
	{
		return 2 * (length + width);
	}
	
	public boolean isSmaller(Rectangle otherRectangle)
	{
		if (this.area() > otherRectangle.area())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean isSquare()
	{
		if (this.length == this.width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.setParameters(4, 4);
		r2.setParameters(5, 7);
		System.out.println("Area: " + r1.area());
		System.out.println("Perimeter: " + r1.perimeter());
		if (r1.isSmaller(r2) == true)
		{
			System.out.println("The first rectangle is smaller.");
		}
		else
		{
			System.out.println("The second rectangle is smaller.");
		}
		if (r1.isSquare() == true)
		{
			System.out.println("The first rectangle is a square.");
		}
		else
		{
			System.out.println("The first rectangle is not a square.");
		}
	}

}
