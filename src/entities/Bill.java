package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if (feeding() > 30) {
			double cover = 0.00;
			return cover;
		}
		else {
			double cover = 4.00;
			return cover;
		}
		
	}
	
	public double feeding() {
		double feeding = beer * 5 + softDrink * 3 + barbecue * 7;
		return feeding;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}	
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
}
