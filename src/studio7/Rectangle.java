package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle (double length, double width ) {
		this.length=length;
		this.width=width;
		
		
	}
	
	public double Area () {
		
		double area= this.length * this.width;
		
		return area;
			
		
		}
	
	public double Perimeter () {
		
		double peri= (2*this.length)+(2*this.width);
		
		return peri;
		
	}
		
	public boolean Square () {
		
		if (this.length==this.width) {
			return true;
		}
		return false;
		
	}
	
	public boolean Size (Rectangle other) {
		
		return this.Area()>other.Area();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
