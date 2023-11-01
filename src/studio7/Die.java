package studio7;

public class Die {

	private int n;
	
	
	public Die (int n) {
	this.n = n;
	
}
	public int DieReturn () {
		
	int roll=	(int)(Math.random()*(this.n))+1;
		
	return roll;
	
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
